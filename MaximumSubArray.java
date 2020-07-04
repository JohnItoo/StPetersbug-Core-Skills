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

        int arrIdx = ((segLen-1) - (len -1));
        int st= arrIdx - (len/2);
        makeSegmentTree(st, (len/2),  segmentTree);
        for(int i = 0; i < segLen; i++) {
            out.print(segmentTree[i] + " ");
        }

        out.println();
        for(int i = arrIdx; i < segLen; i++) {
            long ans = findMax(i, segmentTree, -1000001);
            out.print(ans + " ");
        }
        in.close();
        out.close();
    }

    private static void makeSegmentTree(int left, int times, long[] segmentTree) {
        int i = 0;
        int beg = left;
        while(i < times) {
            i++;
            segmentTree[beg] = segmentTree[beg*2] + segmentTree[(beg*2) + 1];
            beg++;
        }
        if(left == 1) return;
        int newLeft = left - (times/2);
        makeSegmentTree(newLeft, times/2, segmentTree);
    }

    //traverses tree upwardly
    private static long findMax(int start, long[] segmentTree, long currMax) {
        if(start == 1) {
            return Math.max(currMax, segmentTree[start]);
        }
        currMax = Math.max(currMax, segmentTree[start]);
        
        findMax(start/2, segmentTree, currMax);
        return 0;
    }
}
