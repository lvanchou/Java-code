//二维数组遍历

public class arrorder {
    public static void main(String[] args) {
        int[][]arr1={{1,2,3},{4,5},{6}};
        arrorder1(arr1);
    }
    public static void arrorder1(int [][]arr){
        for (int x=0;x< arr.length;x++){
            for (int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+",");
            }
            System.out.println();
        }
    }
}
