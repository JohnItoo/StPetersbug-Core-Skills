package helpers;

public class ActivitySelection {
    //TODO : Move Proof to LATeX.
    /**
     * Minimum Right endpoints.
     * Lemma: there exists an optimal solution that contains the segment with the minimum  Right endpoint.
     * i.e if we take the segment with the minimum right endpoint, we can still extend it into an optimal solution.
     *
     * Let [a,b] be the segment with the minimum right endpoint, and let S be an optimal solution
     * such that [c,d] be the segment from S with its minimal right endpoint. i.e [c.d] is the segment in the
     * optimal solution with the minimal endpoint.
     * if [a,b] coincides with [c,d] that means then there is nothing to prove.
     * if d > b. we have to prove that there is some other optimal solution that includes [a,b] .
     * So we will remove [c,d] from S and instead use [a,b] as the segment in S with the minimal right endpoint.
     *
     * So the claim is the size of this new solution is the size of S. (we just replaced one segment)
     * And that the new solution is still a solution, I.e [a,b] does not overlap any segment in S.
     *
     * b < d so [a,b] lies to the left of d and all other segments in s, lie to the right of d. 
     *
     * but if b < d,
     */
}
