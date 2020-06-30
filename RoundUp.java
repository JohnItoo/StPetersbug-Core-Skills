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
        long z = 0;
//        if(y * z >= x) {
//            out.println(0);
//        } else {
//            z = 1;
//            while(y*z < x) {
//                z += 1;
//                out.println(z);
//            }
//            out.println(z);
//        }
        out.println(y*z);

        in.close();
        out.close();
    }
}
