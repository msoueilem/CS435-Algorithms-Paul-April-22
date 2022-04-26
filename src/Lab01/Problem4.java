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
        ArrayList<Integer> secondList = new ArrayList<Integer>();
        int smallest;
        int index=0;
        System.out.println("List before sorted: "+list.toString());
        while (list.size()>1) {
            smallest = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) < smallest) {
                    smallest = list.get(i);
                    index = i;
                }
            }
            secondList.add(smallest);
            list.remove(index);
        }
        secondList.add(list.get(0));
        list=secondList;
        System.out.println("List after  sorted: "+list.toString());
    }
    public static void sort(LinkedList<Integer> list){
        //implement
        LinkedList<Integer> secondList = new LinkedList<>();
        System.out.println(secondList.toString());
        System.out.println(list.toString());
    }

    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList() {
            {
                add(1);
                add(3);
                add(9);
                add(4);
                add(5);
                add(8);
            }
        };
        LinkedList<Integer> a = new LinkedList<>() {
            {
                add(1);
                add(3);
                add(9);
                add(4);
                add(5);
                add(8);
            }
        };
        sort(b);
        sort(a);
    }
}
