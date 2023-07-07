public class Customer {
    private int customer_id;
    private String address;
    private int contact_information;

    public Customer(int customer_id, String address, int contact_information) {
        this.customer_id = customer_id;
        this.address = address;
        this.contact_information = contact_information;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public String getAddress() {
        return address;
    }

    public int getContactInformation() {
        return contact_information;
    }

    public void requestBodaboda() {
        // Implementation code
    }

    public void viewBodabodaDetails() {
        // Implementation code
    }

    public void viewAccidentRecords() {
        // Implementation code
    }

    public void giveStarRates() {
        // Implementation code
    }

    @Override
    public String toString() {
        return "Customer [customer_id=" + customer_id + ", address=" + address + ", contact_information="
                + contact_information + "]";
    }
           
}
