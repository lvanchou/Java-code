//���е���������
import java.util.Scanner;
public class forfor02 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("����������,�˳�������65");
        int a = sc1.nextInt();
                int e = a * 2 - 1;
                //bΪ������
                int b = (e + 1) / 2;
                //xΪ���������
                for (int x = 1; x <= b; x++) {
                    //cΪ���п���
                    int c = x * 2 - 1;
                    //dΪ������Ҫ�Ŀո���
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
