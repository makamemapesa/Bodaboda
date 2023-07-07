public class Bodaboda {
    private String bodaboda_id;
    private int customer_id;
    private String plate_no;
    private String driver_license;
    private Customer customer;

    public Bodaboda(String bodaboda_id, int customer_id, String plate_no, String driver_license, Customer customer) {
        this.bodaboda_id = bodaboda_id;
        this.customer_id = customer_id;
        this.plate_no = plate_no;
        this.driver_license = driver_license;
        this.customer = customer;
    }

    public String getBodabodaId() {
        return bodaboda_id;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public String getPlateNo() {
        return plate_no;
    }

    public String getDriverLicense() {
        return driver_license;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void giveStarRates() {
        // Implementation code
    }

    public void takeOrder() {
        // Implementation code
    }

    public void assignSystem() {
        // Implementation code
    }

    public void viewRates() {
        // Implementation code
    }

    public void license() {
        // Implementation code
    }

    @Override
    public String toString() {
        return "Bodaboda [bodaboda_id=" + bodaboda_id + ", customer_id=" + customer_id + ", plate_no=" + plate_no
                + ", driver_license=" + driver_license + ", customer=" + customer + "]";
    }
    

}
