package chapter4;

import java.io.PrintWriter;
import java.util.Scanner;

public class MaximalDistance {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = in.nextInt();
        int a, b;
        a = in.nextInt();
        out.println(1 + " " + 1);
        int biggest = a;
        int bigIdx = 1;
        int smallest = a;
        int smallestIdx = 1;
        for (int i = 2; i <= n; i++) {
            int curr = in.nextInt();
            if (curr > biggest) {
                biggest = curr;
                bigIdx = i;
            } else if (curr < smallest) {
                smallest = curr;
                smallestIdx = i;
            }

            out.println(Math.min(smallestIdx, bigIdx) + " " + Math.max(smallestIdx, bigIdx));
        }

        in.close();
        out.close();
    }
}
