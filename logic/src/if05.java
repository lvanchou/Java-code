//¼¾½Ú
import java.util.Scanner;

class if05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ÊäÈëÔÂ·Ý");

        int month=sc.nextInt();

        if (month>12||month<1) {

            System.out.println("ÊäÈë´íÎó");

        }else if (month>=3&&month<=5) {

            System.out.println("´º");

        }else if (month>=6&&month<=8) {

            System.out.println("ÏÄ");

        }else if (month>=9&&month<=11) {

            System.out.println("Çï");

        }else {
        System.out.println("¶¬");
        }
    }
}
