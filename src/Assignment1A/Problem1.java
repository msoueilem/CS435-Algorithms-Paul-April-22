/**
* Given an array arr of distinct integers and an integer z,
* determine whether arr contains two distinct numbers x and y so that x + y = z.
* Solve the problem by implementing the following Java method.
**/

package Assignment1A;

class Problem1 {

    public static boolean sumFound(int[] arr, int z) {
        if (arr == null || arr.length < 2) {
            return false;
        }
        // implement
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] + arr[j] == z && arr[i] != arr[j]) {
                    System.out.printf("Index i: %d data of Index %d Index j: %d data of Index %d \n%d+%d=%d\n", i,
                            arr[i], j, arr[j], arr[i], arr[j], z);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] b = { 3, 3, 4, 7 };
        System.out.println(sumFound(b, 6));
    }
}
