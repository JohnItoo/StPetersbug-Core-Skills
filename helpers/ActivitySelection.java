package helpers;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
     * We know that [c,d] does not overlap any other segments in S. so every other segment in S is to the right
     * and if  b < d so b lies to the left of d and all other segments in s, lie to the right of d. So for sure,
     * [a,b] does not overlap any segments in S.
     *
     */

    /**
     * Implemntation
     */

    public static void main(String[] args) {
        List<Pair<Integer, Integer>> schedules = new ArrayList<>();
        schedules.add(new Pair(1, 3));
        schedules.add(new Pair(1, 4));
        schedules.add(new Pair(5, 6));

        activitySelection(schedules);
    }

    private static void activitySelection(List<Pair<Integer, Integer>> schedules) {
        int indexOfCurrentMinimum = 0;
        int ans = 0;
        while (!schedules.isEmpty()) {
            System.out.println("begins");

            // gets the segment with the least end time;
            for (int i = 1; i < schedules.size(); i++) {
                if (schedules.get(i).getValue() < schedules.get(indexOfCurrentMinimum).getValue()) {
                    indexOfCurrentMinimum = i;
                }
            }
            // marks all segments that will overlap with our current minimum endtime segment
            List<Integer> toRemove = new ArrayList<>();
            for (int i = 0; i < schedules.size(); i++) {
                if (indexOfCurrentMinimum == i) continue;
                if (overlaps(schedules.get(i), schedules.get(indexOfCurrentMinimum))) {
                    System.out.println("Will remove : " + i);
                    toRemove.add(i);
                }
            }
            System.out.println("THis is current Min : " + indexOfCurrentMinimum + " ; size : " + schedules.size());
            // removes all segments that are marked above.
            for (int toR : toRemove) {
                System.out.println(toR);
                schedules.remove(toR);
            }
            //removes current minimum endpoint segment and optionally adds it to a list if we need the arrangement as answer or
            //simply remove and increment count of answer as is done here.
            schedules.remove(indexOfCurrentMinimum);
            ans++;
        }
        System.out.println(ans);
    }

    private static boolean overlaps(Pair<Integer, Integer> i1, Pair<Integer, Integer> i2) {
        int a = i1.getKey();
        int b = i1.getValue();
        int c = i2.getKey();
        int d = i2.getValue();
        return ((c <= a && a <= d) || (a <= d && d <= b));
    }
}
