public class Accident {
    private String accidentNo;
    private String bodabodaId;
    private String accidentLocation;
    private Bodaboda bodaboda;

    public Accident(String accidentNo, String bodabodaId, String accidentLocation, Bodaboda bodaboda) {
        this.accidentNo = accidentNo;
        this.bodabodaId = bodabodaId;
        this.accidentLocation = accidentLocation;
        this.bodaboda = bodaboda;
    }

    public String getAccidentNo() {
        return accidentNo;
    }

    public String getBodabodaId() {
        return bodabodaId;
    }

    public String getAccidentLocation() {
        return accidentLocation;
    }

    public Bodaboda getBodaboda() {
        return bodaboda;
    }

    public void viewAccidentNo() {
        // Implementation code
    }

    public void viewAccidentType() {
        // Implementation code
    }

    @Override
    public String toString() {
        return "Accident [accidentNo=" + accidentNo + ", bodabodaId=" + bodabodaId + ", accidentLocation="
                + accidentLocation + ", bodaboda=" + bodaboda + "]";
    }
    
}
