//�ɼ�����
import java.util.Scanner;

public class if03 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("����ɼ���");

        int x=sc.nextInt();

            if (x>100||x<0){
            System.out.println("�������");
        }

            else if (x>=90) {

            System.out.println("�ɼ�����");
        }
            else if (x>=80) {

            System.out.println("�ɼ���");
        }
            else if (x>=70) {

            System.out.println("�ɼ���");
        }
            else if (x>=60) {

            System.out.println("�ɼ�����");
        }
            else {
            System.out.println("�ɼ�������");
        }
        }

    }