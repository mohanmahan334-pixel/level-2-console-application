import java.io.*;

class EB_Bill {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Government of Tamilnadu");
        System.out.println("Electricity Board");
        System.out.println("-----");
        System.out.println("Bill Receipt");
        System.out.println("-----");

        System.out.println("Enter the EB No");
        String s1 = br.readLine();
        int ebNo = Integer.parseInt(s1);

        System.out.println("Enter the customer name");
        String name = br.readLine();

        System.out.println("Enter the previous unit");
        int previousUnit = Integer.parseInt(br.readLine());

        System.out.println("Enter the current unit");
        int currentUnit = Integer.parseInt(br.readLine());

        int unitsConsumed = currentUnit - previousUnit;
        int amount = unitsConsumed * 5;

        System.out.println("\n----- Report -----");
        System.out.println("EB No: " + ebNo);
        System.out.println("Customer Name: " + name);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Amount to be Paid: " + amount + " Rs");
    }
}