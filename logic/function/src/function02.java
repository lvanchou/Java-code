//三个数中最大值

import  java.util.Scanner;
public class function02 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("first:");
        int x= sc.nextInt();
        System.out.println("second:");
        int y= sc.nextInt();
        System.out.println("third:");
        int z= sc.nextInt();
        System.out.println(getmax(x,y,z));
    }

    public static int getmax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        }else {
            if (b>c){
                return b;
            }else {
                return c;
            }
        }
    }
}