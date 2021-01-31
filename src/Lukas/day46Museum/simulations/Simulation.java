package Lukas.day46Museum.simulations;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import Lukas.day46Museum.generators.PersonGenerator;
import Lukas.day46Museum.generators.ArtPieceGenerator;
import Lukas.day46Museum.generators.RoomGenerator;
import Lukas.day46Museum.models.ArtPiece;
import Lukas.day46Museum.models.Guard;
import Lukas.day46Museum.models.Museum;
import Lukas.day46Museum.models.Room;
import Lukas.day46Museum.models.Thief;
import Lukas.day46Museum.models.Visitor;


public class Simulation {
	Museum museum;
	int numberOfRooms;
	int numberOfGuards;
	int maxGuestsPerTick;

	public Simulation(Museum museum, int numberOfRooms, int numberOfGuards, int maxGuestsPerTick) {
		this.museum = museum;
		this.numberOfRooms = numberOfRooms;
		this.numberOfGuards = numberOfGuards;
		this.maxGuestsPerTick = maxGuestsPerTick;
	}

	public void init() {
		// Console message
		System.out.println("--------------------");
		System.out.println("Initializing museum");
		System.out.println("--------------------");

		// Generate the Rooms with initial ArtPieces
		Room[] rooms = new Room[numberOfRooms];
		int totalNumberOfArtPieces = 0;

		for (int i = 0; i < numberOfRooms; i++) {
			Random random = new Random();
			int numberOfArtPieces = random.nextInt(5) + 4;
			ArtPiece[] artPieces = new ArtPiece[numberOfArtPieces];
			for (int j = 0; j < numberOfArtPieces; j++) {
				artPieces[j] = (ArtPieceGenerator.createArtPiece());
				totalNumberOfArtPieces++;
			}
			rooms[i] = RoomGenerator.createRoom(i + 1, artPieces);
		}
		museum.setRooms(rooms);
		System.out.println("\n" + numberOfRooms + " Rooms created");
		System.out.println(totalNumberOfArtPieces + " ArtPieces created");

		// Generate the Guards
		Guard[] guards = PersonGenerator.createGuards(numberOfGuards);
		for (Guard guard : guards) {
			guard.visitRoom(museum.getRandomRoom());
		}
	}

	public void start() {
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
		System.out.println("\n--------------------");
		System.out.println("Starting simulation");
		System.out.println("--------------------");
		
		Calendar currentTime = (Calendar) museum.getOpeningTime().clone();
		Calendar closingHour = museum.getClosingTime();
		
		closingHour.add(Calendar.MINUTE, -15);

		while (currentTime.compareTo(closingHour) < 0) {
			System.out.println("\n" + timeFormat.format(currentTime.getTime()));
			currentTime.add(Calendar.MINUTE, 15);

			if (museum.isOpenForVisitors(currentTime)) {
				addRandomVisitorsToMuseum();
				addRandomThief();
			};

			museum.simulate();
			timeSleep(100);
		}
		System.out.println("\n" + timeFormat.format(currentTime.getTime()));
		museum.close();

		System.out.println("\n--------------------");
		System.out.println("Simulation completed");
		System.out.println("--------------------\n");
	}

	// -- HELPER -----------------------------------------------------------------------------------
	private void addRandomVisitorsToMuseum() {
		Random random = new Random();

		Visitor[] visitors = PersonGenerator.createVisitors(random.nextInt(3));
		for (Visitor visitor : visitors) {
			Room room = museum.getRandomRoom();
			visitor.visitRoom(room);
			visitor.observeArtPiece(room.getRandomArtPiece());
		}
	}

	private void addRandomThief() {
		Random random = new Random();

		if (random.nextInt(10) <= 2) { // random: 0...9
			Thief thief = PersonGenerator.createThief();
			Room room = museum.getRandomRoom();
			thief.visitRoom(room);
			thief.observeArtPiece(room.getRandomArtPiece());
		}
	}

	private void timeSleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException ie) {
			// I don't care about that
		}
	}
}
