package Lukas.day46Museum.enums;

import java.util.Random;

public enum ArtType {
		ABSTRACT_ART,
		CONCEPTUAL_ART,
		INSTALLATION_ART,
		MINIMALISM,
		NEO_IMPRESSIONALISM,
		POP_ART,
		POST_IMPRESSIONISM;

		private static final ArtType[] artTypes = values();
		private static final Random random = new Random();

		@Override
		public String toString() {
			switch (this) {
				case ABSTRACT_ART :
					return "Abstract Art";
				case CONCEPTUAL_ART:
					return "Conceptual Art";
				case INSTALLATION_ART:
					return "Installation Art";
				case MINIMALISM:
					return "Minimalism";
				case NEO_IMPRESSIONALISM:
					return "Neo Impressionalism";
				case POP_ART:
					return "Pop Art";
				case POST_IMPRESSIONISM:
					return "Post Impressionism";
			}
			return "Unknown";
		}

		public static ArtType getRandom() {
			return artTypes[random.nextInt(artTypes.length)];
		}
	}
