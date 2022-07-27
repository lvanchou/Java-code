public class while03 {
    public static void main(String[] args) {
       int gs=0;
       int x=100;
       while (x<1000){

            int b=x/100;
            int s=(x-b*100)/10;
            int g=x%10;
            int r=b*b*b+s*s*s+g*g*g;
            if (r==x){
                gs+=1;
                System.out.println(x);
            }
            x++;
        }
        System.out.println(gs);
    }
}

