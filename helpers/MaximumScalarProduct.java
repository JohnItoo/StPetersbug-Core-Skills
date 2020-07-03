package helpers;

public class MaximumScalarProduct {
    /**
     * Lemma; Two arrays A and B maximum scalar product.
     * ai is max in A
     * and
     * bj is max in B
     * There exists an optimal solution where the largest element in a, ai, pairs with
     * the largest element in b, bk;
     * if optimum solution pairs ai and bj then we are done.
     * But assuming we pair ai with some other number in B other than bj,
     *  let S = (ai * bp) + (aq + bj) + ....
     * and S* = (ai * bj) + (aq*bp) + ....;
     * We want to prove that S* is not worse than S
     *
     * (S*) - (S) =
     * (aibj + aqbp )- (aibp +aqbj)
     * (S*) - (S) =  aibj + aqbp - aibp - aqbj
     * ai(bj-bp) + aq(bp-bj) or ai(bj-bp) -aq(bj -bp)
     * (ai- aq) (bj-bp)  is >= 0 because we are multiplying two positive integers  (ai >= aq) and (bj >=bp)
     *
     */

    /*
     Code : pick
     */
}
