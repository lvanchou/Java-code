/*¹þ¹þ*/

import java.util.Scanner;

public class keyboard01 {

    public static void main(String[] args) {

        System.out.println("plus two numbers:");

        Scanner SC=new Scanner(System.in);

        System.out.println("please write down your first number:");

        int x=SC.nextInt();

        System.out.println("you written:"+x);

        Scanner SC1=new Scanner(System.in);

        System.out.println("please write down your second number:");

        int y=SC1.nextInt();

        System.out.println("you written:"+y);

        int c=x+y;

        System.out.println("result is:"+c);


    }
}
