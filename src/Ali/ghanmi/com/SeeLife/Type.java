package Ali.ghanmi.com.SeeLife;

public enum Type {
    VISITOR, STAFF;

    @Override
    public String toString() {
        switch (this) {
            case VISITOR:
                return ("visitor");
            case STAFF:
                return ("staff");
            default:
                return "not defind";
        }
    }
}