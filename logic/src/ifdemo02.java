//��ż�ж�
import java.util.Scanner;

public class ifdemo02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("�������ѯ����");

        int x=sc.nextInt();

        int a=x%2;

        if(a==0) {
            System.out.println("ż��");

        }else {
            System.out.println("����");
        }
    }
}
