package helpers;

public class LevinshteinDistance {
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
     */
}
