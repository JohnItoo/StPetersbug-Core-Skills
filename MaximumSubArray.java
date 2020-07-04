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
        int segLen = 2*len;
        long[] segmentTree = new long[segLen];
        int zeros = len - n;
        int start = (segLen-1) - (len-1);
        int rd = 0;
        while(rd < n) {
            segmentTree[start++] = in.nextLong();
            rd++;
        }
        int z = 0;
        while(z < zeros) {
            segmentTree[start++] = 0;
            z++;
        }

        out.println();
        for(int i = 0; i < segLen; i++) {
            out.print(segmentTree[i] + " ");
        }
//        makeSegmentTree((a - 1) -(n-1), n,  segmentTree);

        in.close();
        out.close();
    }

//    private static void makeSegmentTree(long left, long times, long[] segmentTree) {
//        if(start) {
//
//        }
//    }
}
