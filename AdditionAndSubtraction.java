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
        if (x == z) {
            result = 0;
        } else if (x > y) {
            while (true) {
                if (list.get(i - 1) > z && list.get(i - 2) > z) {
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
            }
        }

        for(int item : list) {
            out.println(item);
        }
        out.println(result);

        in.close();
        out.close();
    }
}