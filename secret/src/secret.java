//8位数加密，倒，每位+5，取余，头尾互换。

import  java.util.Scanner;
import java.lang.Math;
public class secret {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("请输入被加密8位数：");
        int secret1= sc.nextInt();
        secreting(secret1);
    }


    public static void secreting(int secret){
        int []arr=new int[8];
        int intlized= (int) (secret/Math.pow(10,7));
        arr[7]=intlized;

        for (int x=6;x>=0;x--){
            int head= (int) (intlized*Math.pow(10,x+1));
            intlized= (int) ((secret-head)/Math.pow(10,x));
            secret=secret-head;
            arr[x]=intlized;
        }

        for (int x=0;x<8;x++){
            int add=arr[x]+5;
            int num=add%10;
            arr[x]=num;
        }

        int temp=arr[0];
        arr[0]=arr[7];
        arr[7]=temp;

        System.out.print("加密后：");

        for (int x=0;x<8;x++) {
            System.out.print(arr[x]);
        }
            System.out.println();
        }
    }