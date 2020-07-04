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
        int[][] map = new int[26][s.length()];
        for (int i = 0; i < 26; i++) {
            int occur = 0;
            for (int j = 0; j < s.length(); j++) {
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
            l -= 1;
            r -= 1;
            int currMax = 0;
            int currIdx = 0;
            for (int j = 0; j < 26; j++) {
                int limit = l;
                if (l > 0) {
                    limit -= 1;
                    limit = map[j][limit];
                } else {
                    limit = 0;
                }
                int diff = map[j][r] - limit;
                if (diff >= currMax) {
                    currMax = diff;
                    currIdx = j;
                }
            }
            out.println((char) (currIdx + 'a'));
        }


        in.close();
        out.close();
    }
}
