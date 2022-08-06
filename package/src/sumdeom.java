//定义类，实现两数相加

import java.util.Scanner;
//基本类
class sum{
    private int a;
    private int b;

    public void plus(int a,int b){
        System.out.println("sum:"+(a+b));
    }
}

//测试类
class sumdeom {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("输入两数：");
        int a= sc1.nextInt();
        int b= sc2.nextInt();
        sum d=new sum();
        d.plus(a,b);

    }
}
