//奇偶判断
import java.util.Scanner;

public class ifdemo02 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("请输入查询数：");

        int x=sc.nextInt();

        int a=x%2;

        if(a==0) {
            System.out.println("偶数");

        }else {
            System.out.println("奇数");
        }
    }
}
