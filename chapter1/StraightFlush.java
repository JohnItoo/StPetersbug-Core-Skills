package chapter1;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StraightFlush {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String c = in.nextLine();

        String[] cards = c.split(" ");
        char suit = '0';
        String ans = "YES";
        for (int i = 0; i < 5; i++) {
            String card = cards[i];
            if (suit != '0' && suit != card.charAt(1)) {
                ans = "NO";
            }
            suit = card.charAt(1);
            cards[i] = card;
        }
        if (!ans.equals("NO")) {
            List<Integer> chars = new ArrayList();
            boolean ace = false;
            for (int i = 0; i < 5; i++) {
                char curr = cards[i].charAt(0);
                if (curr == 'T') {
                    chars.add(10);
                } else if (curr == 'J') {
                    chars.add(11);
                } else if (curr == 'Q') {
                    chars.add(12);
                } else if (curr == 'K') {
                    chars.add(13);
                } else if (curr == 'A') {
                    chars.add(14);
                } else {
                    chars.add(Integer.parseInt(String.valueOf(curr)));
                }
            }
            Collections.sort(chars);

            for (int i = 0; i < 4; i++) {
                if (chars.get(i) + 1 != chars.get(i + 1)) {
                    if ((chars.get(0) != 2 || chars.get(4) != 14 || i < 3)) {
                        ans = "NO";
                    }
                }
            }
        }
        out.println(ans);
        in.close();
        out.close();
    }
}
