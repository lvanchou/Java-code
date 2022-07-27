//1——1000满足条件个数

public class for03 {
    public static void main(String[] args) {
        int count=0;
        for (int  x=1;x<=999;x++){
            int a=x%3;
            int b=x%5;
            int c=x%7;
            if (a==2&&b==3&&c==2){
                count++;
                System.out.println(x);
            }
        }
        System.out.println(count);
    }

}
