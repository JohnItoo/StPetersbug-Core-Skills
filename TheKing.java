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
        result = ans;
        out.println(result);

        in.close();
        out.close();
    }
    static int ans = 0;
    static void place(int r, int c, int rows, int cols, int[][] board, int kings) {
        if(r == rows && c == 0) {
            System.out.println("here : " + kings);
            ans = Math.max(ans, kings);
            return;
        }
        if(board[r][c] == -1) return;
        board[r][c] = 2;
        ans = Math.max(ans,kings+1);
        System.out.println("Placed, Lets find space " + r + " " + c);
        int[][] spaces = { {0,1}, {1,1} , {1,0}, {1,-1}, {0,-1}, {-1, -1}, {-1, 0}, {-1,1}};
        for(int i = 0; i <spaces.length; i++) {
            int nr = r + spaces[i][0];
            int nc = r + spaces[i][1];
            if( nr >= rows || nr < 0 || nc >= cols || nc <0) continue;
            System.out.println("found space");
            board[nr][nc] = -1;
            int fc = c+1;
            int fr = r;
            if(fc >= cols) {
                fc = 0;
                fr = r+1;
            }
            place(fr, fc, rows,cols,board, kings+1);
            board[nr][nc] = 0;
        }
    }
}
