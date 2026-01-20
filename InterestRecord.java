public class InterestRecord {

    private String type;
    private double principal;
    private double rate;
    private double time;
    private String frequency;
    private double interest;

    public InterestRecord(String type, double principal, double rate,
                          double time, String frequency, double interest) {
        this.type = type;
        this.principal = principal;
        this.rate = rate;
        this.time = time;
        this.frequency = frequency;
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Type: " + type +
               ", Principal: " + principal +
               ", Rate: " + rate +
               ", Time: " + time +
               ", Frequency: " + frequency +
               ", Interest: " + interest;
    }
}
