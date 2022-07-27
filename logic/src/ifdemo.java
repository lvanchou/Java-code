//取大值
import java.util.Scanner;

public class ifdemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("请输入第一个数据");

        int x = sc.nextInt();

        System.out.println("请输入第二个数据");

        int y = sc.nextInt();

        if (x > y) {

            System.out.println(x);
        } else {

            System.out.println(y);
        }
    }

}
