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
        for(int i = 0; i < n ; i++) {
            int l,r;
            l = in.nextInt();
            r = in.nextInt();
            if(l == r) {
                out.println(s.charAt(l-1));
            } else {
                int[] map = new int[26];
                for(int j = l; j <= r; j++) {
                    map[s.charAt(j-1) - 'a']++;
                }
                int max = 0;
                int idx = -1;
                for(int k = 0; k <26; k++) {
                   if(map[k] >= max) {
                       idx = k;
                       max = map[idx];
                   }
                }
                out.println((char) ('a' + idx));
            }
        }

        in.close();
        out.close();
    }
}
