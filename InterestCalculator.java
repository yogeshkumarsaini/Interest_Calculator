import java.util.InputMismatchException;
import java.util.Scanner;

public class InterestCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InterestService service = new InterestService();
        int choice = 0;

        do {
            try {
                System.out.println("\n📊 Interest Calculator");
                System.out.println("1. Simple Interest");
                System.out.println("2. Compound Interest");
                System.out.println("3. View History");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("Enter Principal: ");
                        double p1 = sc.nextDouble();
                        System.out.print("Enter Rate: ");
                        double r1 = sc.nextDouble();
                        System.out.print("Enter Time (years): ");
                        double t1 = sc.nextDouble();

                        double si = service.calculateSimpleInterest(p1, r1, t1);
                        System.out.println("✅ Simple Interest = " + si);
                        break;

                    case 2:
                        System.out.print("Enter Principal: ");
                        double p2 = sc.nextDouble();
                        System.out.print("Enter Rate: ");
                        double r2 = sc.nextDouble();
                        System.out.print("Enter Time (years): ");
                        double t2 = sc.nextDouble();

                        System.out.println("Compound Frequency:");
                        System.out.println("1. Monthly");
                        System.out.println("2. Quarterly");
                        System.out.println("3. Yearly");
                        System.out.print("Choose: ");
                        int freqChoice = sc.nextInt();

                        int frequency = freqChoice == 1 ? 12 :
                                        freqChoice == 2 ? 4 : 1;

                        double ci = service.calculateCompoundInterest(p2, r2, t2, frequency);
                        System.out.println("✅ Compound Interest = " + ci);
                        break;

                    case 3:
                        System.out.println("\n📜 Calculation History");
                        if (service.getHistory().isEmpty()) {
                            System.out.println("No records found.");
                        } else {
                            for (var record : service.getHistory()) {
                                System.out.println(record);
                            }
                        }
                        break;

                    case 4:
                        System.out.println("👋 Exiting... Thank you!");
                        break;

                    default:
                        System.out.println("❌ Invalid choice!");
                }

            } catch (InputMismatchException e) {
                System.out.println("❌ Please enter valid numeric input.");
                sc.nextLine(); // clear buffer

            } catch (InvalidInputException e) {
                System.out.println("❌ " + e.getMessage());
            }

        } while (choice != 4);

        sc.close();
    }
}
