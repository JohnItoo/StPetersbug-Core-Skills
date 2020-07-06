import java.io.PrintWriter;
import java.util.Scanner;

public class YetAnotherSum {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        double wholeSum = 0.00;
        double doubleSum = 0.00;
        for (int i = 0; i < n; i++) {
            double x = in.nextDouble();
            wholeSum += x;
            doubleSum += (1 / x);
        }
        out.println(wholeSum + doubleSum);


        in.close();
        out.close();
    }
}
