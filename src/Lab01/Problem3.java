package Lab01;

import lab1.powerset.PowerSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Problem3 {

    public static boolean sumFound(List list, int k) {
        //implement

        List<Set<Integer>> powerset = PowerSet.powerSet(list);
        for (Set<Integer> l : powerset) {
            int sum = 0;
            for (Integer num : l) {
                sum += num;
            }
            if (sum == k) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        List<Integer> b = List.of( 1,3,9,4,8,5 );
        List<Integer> b = new ArrayList() {
            {
                add(1);
                add(3);
                add(9);
                add(4);
                add(8);
                add(5);
            }
        };
        System.out.println(sumFound(b,21));
    }

}
