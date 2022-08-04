//数组取最值

public class arraymaxmin {
    public static void main(String[] args) {
       int [] arr1={4,43,666,4,3,6,86,85,3,6,90,3,6,100};
       int max=arraymax(arr1);
        System.out.println("max="+max);
    }

    public static int arraymax(int arr[]) {
        int max=arr[0];
        for (int x=1;x< arr.length;x++){
            if (arr[x]>max){
                max=arr[x];
            }
        }
        return max;
    }
}
