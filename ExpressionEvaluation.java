import java.io.PrintWriter;
import java.util.Scanner;

public class ExpressionEvaluation {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        String s;
        s = in.nextLine();
        int lastStart = 0;
        char lastStruct = 'c';
        int result = 0;
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '+' || i == s.length()-1) {
                int lastEnd = i;
                if(i == s.length() -1) lastEnd = s.length();
                String sub = s.substring(lastStart, lastEnd);
                int curr = Integer.parseInt(sub);
               if(lastStruct == 'c' || lastStruct == '+') {
                   result += curr;
               } else {
                   result -= curr;
               }
                lastStart = i+1;
                lastStruct = s.charAt(i);

            }
        }

        // your code

        out.println(result);

        in.close();
        out.close();
    }
}
