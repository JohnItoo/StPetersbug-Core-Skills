import java.io.PrintWriter;
import java.util.Scanner;

public class ManhattanDistance {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        long a, b;
        a = in.nextLong();
        b = in.nextLong();
        out.println(1 + " " + 1);
        long a2 =0 ,b2 = 0;
        int maxIdx = 1;
        int minIdx = 1;
        if(n >= 2) {
            a2 = in.nextLong();
            b2 = in.nextLong();
            if(a2+b2 > a+b) {
                long tempx, tempy;
                tempx = a;
                tempy = b;
                a = a2;
                b = b2;
                a2 = tempx;
                b2 = tempy;
                maxIdx = 2;
                minIdx = 1;
            } else {
                maxIdx = 1;
                minIdx = 2;
            }
            out.println(Math.min(maxIdx, minIdx) + " " + Math.max(maxIdx, minIdx));
        }

        for(int i = 3; i <= n; i++) {
            long x, y;
            x = in.nextLong();
            y = in.nextLong();
            if(x+y >= a +b) {
                a2 = a;
                b2 = b;
                a = x;
                b = y;
                minIdx = maxIdx;
                maxIdx = i;
            } else if (x+y >= a2 + b2) {
                a2 = x;
                b2 = y;
                minIdx = i;
            }
            out.println(Math.min(maxIdx, minIdx) + " " + Math.max(maxIdx, minIdx));
        }
        in.close();
        out.close();
    }
}
