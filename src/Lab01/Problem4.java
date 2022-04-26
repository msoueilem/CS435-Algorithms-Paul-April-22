package Lab01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * (A) You are given an ArrayList of Integer objects.
 * Write a program that efficiently sorts the list; use the following method signature:
 */

/**
 * You are given a linked list containing Integer objects.
 * Write a program that efficiently sorts the list; use the following method signature.
 */

public class Problem4 {

    public static void sort(ArrayList<Integer> list){
        //implement
        ArrayList<Integer> secondList = new ArrayList<>();
        int smallest = list.get(0);
        for (int i = 0; i < list.size()-1; i++) {

            for (int j = 0; j < list.size()-1; j++) {
                smallest = list.get(i);
            if (list.get(j) <= smallest) {
                smallest = list.get(j);
                secondList.add(list.get(j));
                list.remove(j);
//                smallest = list.get(i);
            }

            }
        }
        System.out.println(secondList.toString());
        System.out.println(list.toString());
    }
    public static int findSmallest(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void sort(LinkedList<Integer> list){
        //implement
    }

    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList() {
            {
                add(1);
                add(3);
                add(9);
                add(4);
                add(8);
                add(5);
            }
        };
        sort(b);
        System.out.println();
    }
}
