package chapter3;

import java.io.PrintWriter;
import java.util.Scanner;

public class CompareSums {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n;
        n = in.nextInt();
        double[] a = new double[n + 1];
        double suma = 0.0000000000;
        double sumb = 0.0000000000f;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextDouble();
            suma += a[i];
        }
        double[] b = new double[n + 1];
        for (int i = 0; i < n; i++) {
            b[i] = in.nextDouble();
            sumb += b[i];
        }

        if (Math.abs(suma - sumb) <= 0.0001) {
            out.println("SUM(A)=SUM(B)");
        } else if (suma - sumb > 0) {
            out.println("SUM(A)>SUM(B)");
        } else {
            out.println("SUM(A)<SUM(B)");
        }

        in.close();
        out.close();
    }
}