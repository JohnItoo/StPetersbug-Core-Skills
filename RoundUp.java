import java.io.PrintWriter;
import java.util.Scanner;

public class RoundUp {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        long x;
        long y;
        x = in.nextLong();
        y = in.nextLong();
        long z = (long) -10e9;

            while(y*z <x) {
                z += 1;
//                out.println(z);
            }
            out.println(z);


        in.close();
        out.close();
    }
}
