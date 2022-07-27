//居中等腰三角形
import java.util.Scanner;
public class forfor02 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入行数,退出请输入65");
        int a = sc1.nextInt();
                int e = a * 2 - 1;
                //b为总行数
                int b = (e + 1) / 2;
                //x为此行序号数
                for (int x = 1; x <= b; x++) {
                    //c为此行颗数
                    int c = x * 2 - 1;
                    //d为此行需要的空格数
                    int d = b - x;
                    for (int z = 1; z <= d; z++) {
                        System.out.print(" ");
                    }
                    for (int y = 1; y <= c; y++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
        }
    }
