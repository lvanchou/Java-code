//8位数加密，倒，每位+5，取余，头尾互换。

import  java.util.Scanner;
import java.lang.Math;

public class secret {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in) ;
        System.out.println("请输入被加密的数（小于8位数）：");
        int secret1= sc.nextInt();
        secreting(secret1);
    }


    public static void secreting(int secret){
        //获取密码长度
        int lenght=0;
        for (int x=7;x>=0;x--){
            int y= (int) (secret/Math.pow(10,x));
            if (y!=0){
                lenght=x+1;
                break;
            }
        }
        //数组初始化
        int []arr=new int[lenght];
        int intlized= (int) (secret/Math.pow(10,lenght-1));
        arr[lenght-1]=intlized;

        //倒
        for (int x=lenght-2;x>=0;x--){
            int head= (int) (intlized*Math.pow(10,x+1));
            intlized= (int) ((secret-head)/Math.pow(10,x));
            secret=secret-head;
            arr[x]=intlized;
        }

        //+5取余
        for (int x=0;x<lenght;x++){
            int add=arr[x]+5;
            int num=add%10;
            arr[x]=num;
        }

        //换位
        int temp=arr[0];
        arr[0]=arr[lenght-1];
        arr[lenght-1]=temp;

        //输出
        System.out.print("加密后：");

        for (int x=0;x<lenght;x++) {
            System.out.print(arr[x]);
        }
            System.out.println();
        }
    }