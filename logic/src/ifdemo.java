//ȡ��ֵ
import java.util.Scanner;

public class ifdemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("�������һ������");

        int x = sc.nextInt();

        System.out.println("������ڶ�������");

        int y = sc.nextInt();

        if (x > y) {

            System.out.println(x);
        } else {

            System.out.println(y);
        }
    }

}
