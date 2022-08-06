//两个数比大小

import java.util.Scanner;

public class keyboard02 {

    public static void main(String[] args) {

        System.out.println("compare two numbers");

        Scanner sc=new Scanner(System.in);

        Scanner sc1=new Scanner(System.in);

        System.out.println("first number is");

        int x=sc.nextInt();

        System.out.println("second number is");

        int y=sc1.nextInt();

        int c=(x>y)?x:y;



        System.out.println(c+" is the larger one" );

    }

}
