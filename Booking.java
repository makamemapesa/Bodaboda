public class Booking {
    private String bookingId;
    private String bodabodaId;
    private String bookingDate;
    private String locationDrop;
    private Bodaboda bodaboda;

    public Booking(String bookingId, String bodabodaId, String bookingDate, String locationDrop, Bodaboda bodaboda) {
        this.bookingId = bookingId;
        this.bodabodaId = bodabodaId;
        this.bookingDate = bookingDate;
        this.locationDrop = locationDrop;
        this.bodaboda = bodaboda;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getBodabodaId() {
        return bodabodaId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public String getLocationDrop() {
        return locationDrop;
    }

    public Bodaboda getBodaboda() {
        return bodaboda;
    }

    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId + ", bodabodaId=" + bodabodaId + ", bookingDate=" + bookingDate
                + ", locationDrop=" + locationDrop + ", bodaboda=" + bodaboda + "]";
    }

    
}

