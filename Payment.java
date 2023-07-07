public class Payment {
    private String paymentId;
    private String bookingId;
    private String paymentDateTime;
    private String paymentStatus;
    private Booking booking;

    public Payment(String paymentId, String bookingId, String paymentDateTime, String paymentStatus, Booking booking) {
        this.paymentId = paymentId;
        this.bookingId = bookingId;
        this.paymentDateTime = paymentDateTime;
        this.paymentStatus = paymentStatus;
        this.booking = booking;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getPaymentDateTime() {
        return paymentDateTime;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public Booking getBooking() {
        return booking;
    }

    @Override
    public String toString() {
        return "Payment [paymentId=" + paymentId + ", bookingId=" + bookingId + ", paymentDateTime=" + paymentDateTime
                + ", paymentStatus=" + paymentStatus + ", booking=" + booking + "]";
    }
    
}
