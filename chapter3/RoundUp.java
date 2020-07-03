package chapter3;

import java.io.PrintWriter;
import java.util.Scanner;

public class RoundUp {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        double x;
        double y;
        x = in.nextDouble();
        y = in.nextDouble();
        out.println((int) Math.ceil(x/y));

        in.close();
        out.close();
    }
}
