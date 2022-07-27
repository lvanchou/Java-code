//单项选择题
import java.util.Scanner;

public class switch02 {
    public static void main(String[] args) {

        Scanner key=new Scanner(System.in);

        System.out.println("下列哪项不是味觉？");
        System.out.println("65.酸     66.甜     67.苦     68.辣");

        char x= (char) key.nextInt();

        switch (x)  {
            case 'A'|'B'|'C':
                System.out.println("回答错误");
                break;
            case 'D':
                System.out.println("回答正确");
                break;
            default:
                System.out.println("输入错误");
        }

    }
}
