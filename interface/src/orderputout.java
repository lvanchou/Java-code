import java.util.Scanner;
//��������
class orderputout {
    public void order(person[] arr) {
        System.out.print("[");
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) {
                System.out.println(arr[x] + "]");
            }
            System.out.print(arr[x] + ",");
        }
        System.out.println();
    }
}

//������Ϣ����
    class imformation {
        private static int totalnum;
        static int x=0;
        //�������ݿ⣨���飩
        person[] imformation;

        public void setTotalnum(){
            Scanner sc=new Scanner(System.in);
            totalnum = sc.nextInt();
            imformation= new person[totalnum];
        }

        public void setImformation(String Country) {
                //��¼���˻�����Ϣ
            Scanner sc=new Scanner(System.in);
                System.out.print("�����������������Ӣ��/���ģ���");
                String Name = sc.next();
                System.out.print("��������������䣨���������֣���");
                int Age = sc.nextInt();
                person p = new person(Name, Age, Country) {
                    @Override
                    public void setName(String name) {
                        super.setName(name);
                    }
                };
                imformation[x] = p;
                x++;
        }
            public void getmember (){
                //��������
                orderputout s = new orderputout();
                s.order(imformation);
            }

            public int getTotalnum(){
            return totalnum;
            }

            public int getindex(String Name){

            //for (int index=0;index++) {
                //return index;
            //}
            return -1;
            }
        }




