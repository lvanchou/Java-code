//长方形的面积和周长的类方法

import java.util.Scanner;

class cal{
    private int lenght;
    private int width;

    public cal(int lenght,int width){
        this.lenght=lenght;
        this.width=width;
    }

    public int cri(){
        return (lenght+width)*2;
    }

    public int squ() {
        return lenght*width;
    }
}

public class squaretest {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        System.out.println("输入长与宽：");
        cal c=new cal(sc1.nextInt(), sc2.nextInt());
        System.out.println("周长："+c.cri()+"----"+"面积："+c.squ());
    }
}
