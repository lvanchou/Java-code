//¾Å¾Å³Ë·¨±í

public class forfor03 {
    public static void main(String[] args) {
        for (int x = 1; x < 10; x++) {
            for (int y = 1 ; y <=x; y++) {
                int z=x*y;
                System.out.print(y+"*"+x+"="+z+"\t");
            }
            System.out.println();
        }
    }
}
