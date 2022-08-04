public class reverse {
    public static void reverse1(int []arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length / 2; x++) {
            int temp = arr[x];
            arr[x] = arr[arr.length - 1 - x];
            arr[arr.length - 1 - x] = temp;
        }
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.print(arr[x] + "]");
            } else {
                System.out.print(arr[x] + ",");
            }
        }
    }

    public static void main(String[] args) {
        int []arr1={3,4,5,6,7,8,9,10};
        reverse1(arr1);
    }
}
