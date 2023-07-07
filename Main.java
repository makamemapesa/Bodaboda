public class Main {
    public static void main(String[] args) {
        // Create a Customer object
        Customer customer = new Customer(1, "123 Main Street", 1234567890);

        // Create a Bodaboda object
        Bodaboda bodaboda = new Bodaboda("B001", 1, "ABC123", "D12345", customer);

        // Create a Booking object
        Booking booking = new Booking("B001", "B001", "2023-07-05", "456 Elm Street", bodaboda);

        // Create a Payment object
        Payment payment = new Payment("P001", "B001", "2023-07-05 10:00:00", "Paid", booking);

        // Create an Accident object
        Accident accident = new Accident("A001", "B001", "123 Main Street", bodaboda);

        // Print the string representation of the objects
        System.out.println("Customer: " + customer);
        System.out.println("Bodaboda: " + bodaboda);
        System.out.println("Booking: " + booking);
        System.out.println("Payment: " + payment);
        System.out.println("Accident: " + accident);
    }
}

