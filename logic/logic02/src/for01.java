//Ë®ÏÉ»¨Êý
public class for01 {
    public static void main(String[] args) {
        int d=99;
        int gs=0;
        for (int x=100;x<=999;x++){
            d+=1;
        int b=d/100;
        int s=(d-b*100)/10;
        int g=d%10;
        int r=b*b*b+s*s*s+g*g*g;
        if (r==d){
            gs+=1;
        }
    }
        System.out.println(gs);
    }
}
