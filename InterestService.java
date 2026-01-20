import java.util.ArrayList;
import java.util.List;

public class InterestService {

    private List<InterestRecord> history = new ArrayList<>();

    public double calculateSimpleInterest(double p, double r, double t) {
        validateInputs(p, r, t);
        double si = (p * r * t) / 100;

        history.add(new InterestRecord(
                "Simple Interest", p, r, t, "N/A", si));

        return si;
    }

    public double calculateCompoundInterest(double p, double r, double t, int frequency) {
        validateInputs(p, r, t);

        double amount = p * Math.pow(1 + (r / 100) / frequency, frequency * t);
        double ci = amount - p;

        String freqName = frequency == 12 ? "Monthly" :
                          frequency == 4 ? "Quarterly" : "Yearly";

        history.add(new InterestRecord(
                "Compound Interest", p, r, t, freqName, ci));

        return ci;
    }

    public List<InterestRecord> getHistory() {
        return history;
    }

    private void validateInputs(double p, double r, double t) {
        if (p <= 0 || r <= 0 || t <= 0) {
            throw new InvalidInputException("Principal, Rate, and Time must be greater than zero.");
        }
    }
}
