//x与y的对应值
import java.util.Scanner;

public class if04 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("输入x的值：");

        int x=sc.nextInt();

        int y;

        if (x>=3) {

            y = 2*x+1;

            System.out.println("y="+y);

        }else if (x>=-1) {

            y =2*x;

            System.out.println("y="+y);

        }else {

            y=2*x-1;

            System.out.println("y="+y);

                }
            }

        }
