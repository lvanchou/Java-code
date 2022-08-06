//两个数是否相等

import java.util.Scanner;

public class keyboard04 {

    public static void main(String[] args) {

        System.out.println("Is two numbers equal?");

        Scanner sc=new Scanner(System.in);

        Scanner sc1=new Scanner(System.in);

        System.out.println("The first number is");

        int x=sc.nextInt();

        System.out.println("The second number is");

        int y=sc1.nextInt();

        boolean flag=(x==y);

        System.out.println(flag);

    }

}
