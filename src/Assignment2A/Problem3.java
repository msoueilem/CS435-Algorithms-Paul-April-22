package Assignment2A;

public class Problem3 {
    int[] merge(int[] arr1, int[] arr2) {
        int[] arr = new int[]{};
        int index = 0;
        int j = 0;
        int i = 0;
        while (i < arr1.length && j < arr2.length){

            if (arr1[i] < arr2[j])
//                System.out.println("arr1: " + arr1[i++] + " i: " + i);
                arr[index++]=arr1[i++];
             else
//                System.out.println("arr2: " + arr2[j++] + " j: " + j);
                arr[index++]=arr2[j++];

        }
        while (i<arr1.length){
//            System.out.println("arr1: " + arr1[i++] + " i: " + i);
            arr[index++]=arr1[i++];
        }
        while (j<arr2.length){
//            System.out.println("arr2: " + arr2[j++] + " j: " + j);
            arr[index++]=arr2[j++];
        }
//        System.out.print("[ ");
//        for (int k = 0; k < arr.length-2; k++) {
//            System.out.print(arr[k]+",");
//        }
//        System.out.print(arr[arr.length-1]+" ]");
        return arr;
    }

    public static void main(String[] args) {
        int[] b = { 1, 3, 4, 7 };
//        int[] a = { 2, 3, 5, 9, 9 };
        int[] a = { 8, 9 };
        Problem3 p1 = new Problem3();
        p1.merge(a,b);
        System.out.println();
    }
}
