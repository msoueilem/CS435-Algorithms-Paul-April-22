class Problem1{
    public static boolean sumFound(int[] arr, int z) {
        if(arr==null || arr.length < 2) {
        return false;
        }
        //implement
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==j){
                    continue;
                }
                if(arr[i]+arr[j]==z){
                    System.out.printf("Index i: %d data of Index %d Index j: %d data of Index %d \n%d+%d=%d\n",i,arr[i],j,arr[j],arr[i],arr[j],z);
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};
        System.out.println(sumFound(a, 2));
    }
}