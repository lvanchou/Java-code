//����ѡ����
import java.util.Scanner;

public class switch02 {
    public static void main(String[] args) {

        Scanner key=new Scanner(System.in);

        System.out.println("���������ζ����");
        System.out.println("65.��     66.��     67.��     68.��");

        char x= (char) key.nextInt();

        switch (x)  {
            case 'A'|'B'|'C':
                System.out.println("�ش����");
                break;
            case 'D':
                System.out.println("�ش���ȷ");
                break;
            default:
                System.out.println("�������");
        }

    }
}
