/*小芳每天得2.5元，每到五的倍数天就会花掉6元，问她几天存到100元*/

public class examination {
    public static void main(String[] args) {
        //money：小芳的钱
        double money=0;
        for (int day=1;true;day++){
            money+=2.50;
            if (day%5==0){
                money-=6.00;
            }
            if (money>=100.00){
                System.out.println("小芳要用"+day+"天");
                break;
            }
        }
    }
}
