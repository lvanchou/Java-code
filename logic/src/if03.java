//成绩评级
import java.util.Scanner;

public class if03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("输入成绩：");

        int x=sc.nextInt();

            if (x>100||x<0){
            System.out.println("输入错误");
        }

            else if (x>=90) {

            System.out.println("成绩优秀");
        }
            else if (x>=80) {

            System.out.println("成绩好");
        }
            else if (x>=70) {

            System.out.println("成绩良");
        }
            else if (x>=60) {

            System.out.println("成绩及格");
        }
            else {
            System.out.println("成绩不及格");
        }
        }

    }