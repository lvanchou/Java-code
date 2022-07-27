//m行n列的*

import java.util.Scanner;
public class forfor01 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入列数");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入行数");
        int lie = sc1.nextInt();
        int hang = sc2.nextInt();
        for (int x = 1; x <= hang; x++) {
            for (int y = 1; y <= lie; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}