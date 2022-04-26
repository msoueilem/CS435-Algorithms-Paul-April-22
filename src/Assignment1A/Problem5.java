/**
 * (A) Determine whether z is in arr.
 * (B) Suppose the array arr is already known to be in sorted order. Can you write a more efficient
 * program for determining whether z is in arr? If yes, why do you think your solution to (B)
 * is faster?
 */
package Assignment1A;

public class Problem5 {
    public static boolean find(int[] arr, int z) {
        //implement
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==z){
                return true;
            }
        }
        return false;
    }
    public static boolean findInSorted(int[] arr, int z) {
        //implement
        if (arr[0]<z||arr[arr.length]>z){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==z){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] b = { 3, 3, 4, 7 };
        int[] a = { 2, 3, 4, 7 };
        System.out.println(find(b,4));
        System.out.println(findInSorted(a,9));
    }
}
