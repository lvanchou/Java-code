/*С��ÿ���2.5Ԫ��ÿ����ı�����ͻỨ��6Ԫ����������浽100Ԫ*/

public class examination {
    public static void main(String[] args) {
        //money��С����Ǯ
        double money=0;
        for (int day=1;true;day++){
            money+=2.50;
            if (day%5==0){
                money-=6.00;
            }
            if (money>=100.00){
                System.out.println("С��Ҫ��"+day+"��");
                break;
            }
        }
    }
}
