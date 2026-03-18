import java.io.*;

class Bill {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Siranjeevi Computer Education");
        System.out.println("no-19,Rettanai,Tindivanam");
        System.out.println("Bill Receipt");
        System.out.println("--------");

        System.out.println("Enter the Product No:");
        String s1 = br.readLine();
        int productNo = Integer.parseInt(s1);

        System.out.println("Enter the Particular");
        String particular = br.readLine();

        System.out.println("Enter the Rate");
        String s3 = br.readLine();
        int rate = Integer.parseInt(s3);

        System.out.println("Enter the Quantity");
        String s4 = br.readLine();
        int qty = Integer.parseInt(s4);

        int amount = rate * qty;
        System.out.println("Product Amount : " + amount);

        double gst = amount * 12 / 100.0;
        System.out.println("GST (12%) : " + gst);

        double total = amount + gst;
        System.out.println("Total Amount : " + total);

        System.out.println("-----");
    }
}