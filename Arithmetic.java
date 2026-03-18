import java.io.*;

class Arithmetic
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Arithmetic Operations");
        System.out.println("---------------------");

        System.out.println("Enter the first number");
        int a = Integer.parseInt(br.readLine());

        System.out.println("Enter the second number");
        int b = Integer.parseInt(br.readLine());

        System.out.println("Result");

        int c = a + b;
        System.out.println("Add = " + c);

        int d = a - b;
        System.out.println("Sub = " + d);

        int e = a * b;
        System.out.println("Mul = " + e);

        int f = a / b;
        System.out.println("Div = " + f);
    }
}