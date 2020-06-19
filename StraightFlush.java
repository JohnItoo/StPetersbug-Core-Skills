import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StraightFlush {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        String[] cards = new String[5];
        char suit = '0';
        String ans = "YES";
        for (int i = 0; i < 5; i++) {
            String card = in.nextLine();
            if (suit != '0' && suit != card.charAt(1)) {
                ans = "NO";
            }
            suit = card.charAt(1);
            cards[i] = card;
        }
        if (ans != "NO") {
            List<String> chars = new ArrayList();
            boolean ace = false;
            for (int i = 0; i < 5; i++) {
                char curr = cards[i].charAt(0);
                if (curr == 'T') {
                    chars.add("10");
                } else if (curr == 'J') {
                    chars.add("11");
                } else if (curr == 'Q') {
                    chars.add("12");
                } else if (curr == 'K') {
                    chars.add("13");
                } else {
                    if (curr == 'A') ace = true;
                    chars.add(String.valueOf(curr));
                }
            }
            Collections.sort(chars);
            for (int i = 0; i < 5; i++) {

            }
        }

        out.println();
        in.close();
        out.close();
    }
}
