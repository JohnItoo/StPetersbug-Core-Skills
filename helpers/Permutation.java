package helpers;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        permute(1, 4);
    }
    static boolean[] chosen = new boolean[4];
    static List<Integer> permutations = new ArrayList<Integer>();

    static  void permute(int k, int n) {
         if( k == n) {
             for (Integer permutation : permutations) {
                 System.out.print(permutation + " ");
             }
             System.out.println();
             return;
         }

         for(int i = 1; i < n; i++) {
             if(chosen[i]) continue;
             chosen[i] = true;
             permutations.add(i);
             permute(k+1, n);
             chosen[i] = false;
             permutations.remove(permutations.size()-1);
         }
    }
}
