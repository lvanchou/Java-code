//三个数比大小

import java.util.Scanner;

    public class keyboard03 {

        public static void main(String[] args) {

            System.out.println("compare three numbers");

            Scanner sc=new Scanner(System.in);

            Scanner sc1=new Scanner(System.in);

            Scanner sc2=new Scanner(System.in);

            System.out.println("first number is");

            int x=sc.nextInt();

            System.out.println("second number is");

            int y=sc1.nextInt();

            System.out.println("third number is");

            int z=sc2.nextInt();

            int c=(x>y)?x:y;

            int d=(c>z)?c:z;

            System.out.println(d+" is the largest one" );

        }

    }
