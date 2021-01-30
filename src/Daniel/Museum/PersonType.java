package Daniel.Museum;

public enum PersonType {
    GUARD, VISITOR, THIEF, CURATOR;

    @Override
    public String toString() {
        switch (this) {
            case GUARD :
                return "Guard";
            case THIEF:
                return "Thief";
            case VISITOR:
                return "Visitor";
            case CURATOR:
                return "Curator";
        }
        return "Unknown";
    }
}
