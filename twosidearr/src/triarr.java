//杨辉三角

import java.util.Scanner;
public class triarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入杨辉三角的行列数：");
        int n=sc.nextInt();
        tri(n);
    }
    public static void tri(int n){
        //定义行列数组
        int[][] arr=new int [n][];
        //分配一维数组空间
        for (int x=0;x< arr.length;x++){
            arr[x]=new int [x+1];
        }
        //赋值1
        for(int x=0;x< arr.length;x++){
            for (int y=0;y<x+1;y++){
                if (y==0||y==x){
                    arr[x][y]=1;
                }
                //规律赋值
                else{
                    for(int x1=1;x1< arr.length;x1++) {
                        for (int y1 = 1; y1 < x1; y1++) {
                            arr[x1][y1] = arr[x1 - 1][y1 - 1] + arr[x1 - 1][y1];
                        }
                    }
                }
            }
        }
        //输出结果
        for (int x=0;x< arr.length;x++){
            for (int y=0;y<arr[x].length;y++){
                System.out.print(arr[x][y]+" ");
            }
            System.out.println();
        }
    }

}
