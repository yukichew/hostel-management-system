package javaassignment.model;

public enum BookingStatus {
    PENDING,
    ACTIVE,
    COMPLETED,
    REJECTED;
    
    @Override
    public String toString() {
        switch (this) {
            case PENDING:
                return "PENDING";
            case ACTIVE:
                return "ACTIVE";
            case COMPLETED:
                return "COMPLETED";
            case REJECTED:
                return "REJECTED";
            default:
                return super.toString();
        }
    }
}


