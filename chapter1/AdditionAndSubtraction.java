package chapter1;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdditionAndSubtraction {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int x, y, z;
        x = in.nextInt();
        y = in.nextInt();
        z = in.nextInt();

        int result = -1;
        List<Integer> list = new ArrayList();
        list.add(0);
        int i = 1;
        if (z == 0) {
            result = 0;
        } else if (x == z) {
            result = 1;
        } else {
            int idx = 1;
            while (true) {
                if (idx > 2000) {
                    break;
                }
                int first = list.get((2 * i) - 2) + x;
                int second = first - y;

                if (first == z) {
                    result = list.size();
                    break;
                }
                list.add(first);
                if (second == z) {
                    result = list.size();
                    break;
                }
                list.add(second);
                i += 1;
                idx++;
            }
        }

        out.println(result);

        in.close();
        out.close();
    }
}