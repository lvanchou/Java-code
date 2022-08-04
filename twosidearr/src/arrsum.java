//二维数组求和

public class arrsum {
    public static void main(String[] args) {
        int [][]arr1={{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
        System.out.println("sum:"+sum(arr1));
    }
    public static int sum(int [][]arr){
        int sum=0;
        for (int x=0;x< arr.length;x++){
            for (int y=0;y<arr[x].length;y++){
                sum+=arr[x][y];
            }
        }
        return sum;
    }
}
