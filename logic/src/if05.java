//����
import java.util.Scanner;

class if05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("�����·�");

        int month=sc.nextInt();

        if (month>12||month<1) {

            System.out.println("�������");

        }else if (month>=3&&month<=5) {

            System.out.println("��");

        }else if (month>=6&&month<=8) {

            System.out.println("��");

        }else if (month>=9&&month<=11) {

            System.out.println("��");

        }else {
        System.out.println("��");
        }
    }
}
