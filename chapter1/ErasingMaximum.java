package chapter1;

import java.io.PrintWriter;
import java.util.Scanner;

public class ErasingMaximum {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i)
            a[i] = in.nextInt();

        int[] result = new int[n - 1];

        int maximum = a[0];
        int counter = 1;
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
                index = i;
                counter = 1;
            } else if (a[i] == maximum && counter < 3) {
                counter++;
                index = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == index) continue;
            if (i < index) result[i] = a[i];
            else {
                result[i - 1] = a[i];
            }
        }

        for (int i = 0; i < result.length; ++i) {
            if (i != 0) out.print(' ');
            out.print(result[i]);
        }
        out.println();

        in.close();
        out.close();
    }
}
