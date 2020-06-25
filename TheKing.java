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
        place(0, 0, r,c, board);

        out.println(result);

        in.close();
        out.close();
    }
    static int place(int r, int c, int rows, int cols, int[][] board, int kings) {
        if(r == rows && )
    }
}
