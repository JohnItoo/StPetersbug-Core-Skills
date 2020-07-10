package helpers;

public class LevinshteinDistance {
    static int[][] ED = new int[10005][10005];
    /**
     * Minimum Edit distance between two strings A and B.
     * is The number of edits to change A -> B.
     * An edit can be a removal, insertion, or deletion.
     *
     * The last column of the optimal alignment must either be
     * an insertion, deletion, or  match/ mismatch. Each of this cost 1
     * except match that costs 0.
     * if it is insertion all B's prefix till that point must optimally match all of A.
     * if it is deletion, all A's prefix till that deletion must optimally match all of B.
     * if it is match/mismatch all A's prefix till that point must optimally match all B's prefix till that point.
     *
     * ED(i,j) is the minimum edit distance of A[0...i-1] and B[0...j-1]
     * ED(i,j) { min( ED(i, j-1) + 1, ED(i-1, j) + 1, ED(1-1, j-1) + diff(A(i-1) , B(j-1) };
     * NB: This diff is 1 if it is a mismatch and 0 if it is a match;
     */

    public static void main(String[] args) {
        editDistance("polynomial", "exponential");
    }

    private static void editDistance(String a, String b) {
      for(int i = 0; i <= 100; i ++) {
          for(int j = 0; j <= 100; j++) {
               ED[i][j] = Integer.MAX_VALUE;
          }
      }
      for(int i = 0; i <= a.length(); i++) {
          ED[i][0] = i;
      }
      for(int j = 0; j <= b.length(); j++) {
          ED[0][j] = j;
      }
        for(int i = 1; i <= a.length(); i++) {
            for(int j = 1; j <= b.length(); j++) {
                int diff = a.charAt(i-1) == b.charAt(j-1) ? 0 : 1;
                ED[i][j] = Math.min( Math.min((ED[i-1][j] + 1), (ED[i-1][j-1] + diff)),
                        Math.min((ED[i-1][j] + 1), (ED[i][j-1] + 1)));
            }
        }
        System.out.println("The edit distance is " +  ED[a.length()][b.length()]);

    }

}
