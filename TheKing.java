import java.io.PrintWriter;
import java.util.Scanner;

public class TheKing {
    public static void main(String[] arg) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int r, c;
        r = in.nextInt();
        c = in.nextInt();
        int[][] board = new int[r][c];
        int result = 0;

        // your code
        place(0, 0, r,c, board,0);

        out.println(result);

        in.close();
        out.close();
    }
    static int ans = 0;
    static void place(int r, int c, int rows, int cols, int[][] board, int kings) {
        if(r == rows && c == cols) {
            ans = Math.max(ans, kings);
            return;
        }
        int[][] spaces = { {0,1}, {1,1} , {1,0}, {1,-1}};
        for(int i = 0; i <4; i++) {
            int nr = r + spaces[i][0];
            int nc = r + spaces[i][1];
            if( nr >= rows || nr < 0 || nc >= cols || nc <0) continue;
        }


    }
}
