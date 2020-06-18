import java.io.PrintWriter;
import java.util.ArrayList;
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
        for (int i = 0; i < 5; i++) {
            String card = inputArray[i];
            if (trailing != 'z' && trailing != card.charAt(1)) {
                isSameSuit = false;
            }
            trailing = card.charAt(1);
            cards.add(card);
            if (card.charAt(0) == '2') twoIdx = i;
            if (card.charAt(0) == 'A') aIdx = i;
            if (card.charAt(0) == 'K') kingIdx = i;
        }
        String ans = "YES";
        if (isSameSuit) {
            if (aIdx != -1) {
                if ((kingIdx != -1 && aIdx > kingIdx) || (twoIdx != -1 && aIdx < twoIdx ))
                    ans = "NO";
            }
        } else {
            ans = "NO";
        }

        out.println(ans);

        in.close();
        out.close();
    }
}
