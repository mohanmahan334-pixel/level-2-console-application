import java.io.*;

class Taksha {
    public static void main(String args[]) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Takshila Uni.");
        System.out.println("Ongur, Tindivanam");
        System.out.println("---");
        System.out.println("Student Marks");
        System.out.println("---");

        System.out.println("Enter Enrollment no.");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);

        System.out.println("Enter student name");
        String s2 = br.readLine();

        System.out.println("Enter Java mark");
        String s3 = br.readLine();
        int m1 = Integer.parseInt(s3);

        System.out.println("Enter OS mark");
        String s4 = br.readLine();
        int m2 = Integer.parseInt(s4);

        System.out.println("Enter CWS mark");
        String s5 = br.readLine();
        int m3 = Integer.parseInt(s5);

        System.out.println("Enter Tamil mark");
        String s6 = br.readLine();
        int m4 = Integer.parseInt(s6);

        int total = m1 + m2 + m3 + m4;
        System.out.println("Total mark: " + total);

        double average = total / 4.0;
        System.out.println("Average mark: " + average);

        System.out.println(".......................");
    }
}