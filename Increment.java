import java.io.PrintWriter;
import java.util.Scanner;

public class Increment {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String x;
        x = in.nextLine();
        int n = x.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x.charAt(i) == '9') count++;
            else break;
        }
        if (count == n) {
            n += 1;
        }

        out.println(n);

        in.close();
        out.close();
    }
}
