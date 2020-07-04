import java.io.PrintWriter;
import java.util.Scanner;

public class MaximumSubArray {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        int len = 1;
        while(len < n) {
            len *= 2;
        }
        int[] segmentTree = new int[2*len];

        in.close();
        out.close();
    }
}
