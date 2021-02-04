package Marcella.Kindergarden;

public enum TypeOfAction {

    CONTACT, PLAYGOOD, PLAYBAD;

    @Override
    public String toString() {
        switch (this) {
            case CONTACT :
                return " hat Kontakt mit einem anderem Kind und freut sich.";
            case PLAYGOOD:
                return " spielt zufrieden.";
            case PLAYBAD:
                return " ist frustriert.";
        }
        return "Unknown";
    }

}
