//数组编历

public class arryorder {
    public static void arryprint(int []arr){
        System.out.print("[");
        for(int x=0;x<arr.length;x++){
            if (x== arr.length-1){
                System.out.println(arr[x]+"]");
            }
            System.out.print(arr[x]+",");
            ;
        }
    }

    public static void main(String[] args) {
        int []arr1={34,34,2323,5,46,57,58,345,2334,2,544,5,5,3};
        arryprint(arr1);
    }
}
