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
                
            }
        }

        in.close();
        out.close();
    }
}
