package Lukas.day46Museum;

import Lukas.day46Museum.simulations.Simulation;
import Lukas.day46Museum.models.Curator;
import Lukas.day46Museum.models.Museum;


public class Main {
	public static void main(String[] args) {

		Museum museum = new Museum("Bergmuseum", new Curator("Taneleer", "Tivan"), 9, 17);

		Simulation simulation = new Simulation(museum, 6, 3, 4);
		simulation.init();
		simulation.start();
	}
}
