import java.io.PrintWriter;
import java.util.Scanner;

public class TheMostFrequentSymbol {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s;
        s = in.nextLine();
        int n;
        n = in.nextInt();
        int[][] map = new int[26][n];
        for (int i = 0; i < 26; i++) {
            int occur = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'a' + i) {
                    occur += 1;
                }
                map[i][j] = occur;
            }
        }
        for (int i = 0; i < n; i++) {
            int l, r;
            l = in.nextInt();
            r = in.nextInt();
            int currMax = 0;
            for(int j = 0; j < )

        }


        in.close();
        out.close();
    }
}
