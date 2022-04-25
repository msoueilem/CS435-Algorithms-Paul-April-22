/*
This method returns the second smallest element of the input array.
*/
public class problem2 {
    public static int secondSmallest(int[] arr) {
        int secondSmallest = 0;
        int smallest = arr[0];
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Input array too small");
        }
        // implement
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                System.out.printf("");
                secondSmallest = smallest;
                smallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args) {
        int[] b = { 3, 3, 4, 7 };
        System.out.println(secondSmallest(b));
    }
}
