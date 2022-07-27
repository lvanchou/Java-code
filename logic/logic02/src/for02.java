//ÎåÎ»Êı


public class for02 {
    public static void main(String[] args) {

        for (int x=10000;x<100000;x++) {
            int w=x/10000;
            int q=(x-w*10000)/1000;
            int s=x/10%10;
            int g=x%10;
            int z=w+q+s+g;
            int b=x/100%10;
            if (z==b&&w==g&&s==q){
                System.out.println(x);
            }


        }
    }
}