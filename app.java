public class App {

    public double calculateBill(String plan, double dataUsed) {

        double limit;
        double rate;

        if (plan.equalsIgnoreCase("Basic")) {
            limit = 50;
            rate = 499;
        } else if (plan.equalsIgnoreCase("Standard")) {
            limit = 100;
            rate = 799;
        } else if (plan.equalsIgnoreCase("Premium")) {
            limit = 200;
            rate = 1099;
        } else {
            return -1;
        }

        double extraCharge = 0;

        if (dataUsed > limit) {
            extraCharge = (dataUsed - limit) * 10;
        }

        return rate + extraCharge;
    }

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Plan (Basic/Standard/Premium): ");
        String plan = sc.nextLine();

        System.out.print("Enter Data Used (GB): ");
        double data = sc.nextDouble();

        App app = new App();
        double bill = app.calculateBill(plan, data);

        System.out.println("\n----- BILL DETAILS -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + id);
        System.out.println("Plan: " + plan);
        System.out.println("Data Used: " + data + " GB");
        System.out.println("Total Bill: Rs." + bill);

        sc.close();
    }
}
