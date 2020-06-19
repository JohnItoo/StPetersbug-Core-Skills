import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StraightFlush {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        List<String> cards = new ArrayList();
        char trailing = 'z';
        boolean isSameSuit = true;
        int twoIdx = -1;
        int aIdx = -1;
        int kingIdx = -1;
        String input = in.nextLine();
        String[] inputArray = input.split(" ");
        int nums = 0;
        for (int i = 0; i < 5; i++) {
            String card = inputArray[i];
            if (trailing != 'z' && trailing != card.charAt(1)) {
                isSameSuit = false;
            }
            trailing = card.charAt(1);

            if (card.charAt(0) == '2') twoIdx = i;
            if (card.charAt(0) == 'A') aIdx = i;
            if (card.charAt(0) == 'K') {
                kingIdx = i;
            }
            if (card.charAt(0) == 'T') {
                card = "10";
                nums++;
            }
            if (card.charAt(0) >= 2 && card.charAt(0) <= 9) {
                nums++;
            }
            cards.add(card);
        }
        String ans = "YES";
        if (isSameSuit) {
            if (nums != cards.size()) {
                ans = "N0";
            } else {


                if (aIdx != -1) {
                    if ((kingIdx != -1 && aIdx > kingIdx) || (twoIdx != -1 && aIdx < twoIdx))
                        ans = "NO";
                } else {
                    if (kingIdx != -1 && twoIdx != -1) ans = "NO";
                    String should = "YES";
                    String first = cards.get(0);
                    boolean isCharacter = first.charAt(0) > 'A' && first.charAt(0) <= 'Q';
                    for (int i = 1; i < cards.size(); i++) {
                        if (isCharacter && (cards.get(i).charAt(0) >= '1' && cards.get(i).charAt(0) <= '9')) {
                            ans = "NO";
                            break;
                        } else if (!isCharacter && (cards.get(i).charAt(0) > 'A' && cards.get(i).charAt(0) <= 'Q')) {
                            ans = "NO";
                            break;
                        }
                    }
                    if (ans.equals("YES") && !isCharacter) {
                        Collections.sort(cards);
                        for (int i = 0; i < 4; i++) {
                            String curr = cards.get(i);
                            String next = cards.get(i + 1);
                            if (Integer.valueOf(curr.charAt(0)) + 1 != Integer.valueOf(next.charAt(0))) {
                                ans = "NO";
                                break;
                            }
                        }
                    }
                }
            }
        } else {
            ans = "NO";
        }

        out.println(ans);

        in.close();
        out.close();
    }
}
