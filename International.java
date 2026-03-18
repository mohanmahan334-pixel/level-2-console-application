import java.io.*;

class International {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("shivaraman International Pvt Ltd");
        System.out.println("T.Nagar, Chennai, Tamil Nadu");
        System.out.println("----------------------------");
        System.out.println("Employee Payroll System");
        System.out.println("----------------------------");

        System.out.print("Enter the emp id: ");
        int id = Integer.parseInt(br.readLine());

        System.out.print("Enter the emp name: ");
        String name = br.readLine();

        System.out.print("Enter the salary: ");
        int sal = Integer.parseInt(br.readLine());

        int bonus = sal * 20 / 100;
        int increment = sal * 10 / 100;
        int gross = sal + bonus + increment;

        System.out.println("\nIncome");
        System.out.println("Bonus: " + bonus);
        System.out.println("Increment: " + increment);
        System.out.println("Gross Pay: " + gross);

        int rental = sal * 3 / 100;
        int lic = sal * 2 / 100;

        System.out.println("\nDeductions");
        System.out.println("Rental: " + rental);
        System.out.println("LIC: " + lic);

        int netpay = gross - (rental + lic);

        System.out.println("\nNet Pay: " + netpay);
    }
}