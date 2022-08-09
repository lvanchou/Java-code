import java.util.Scanner;
//遍历方法
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

//处理信息方法
    class imformation {
        private static int totalnum;
        static int x=0;
        //建立数据库（数组）
        person[] imformation;

        public void setTotalnum(){
            Scanner sc=new Scanner(System.in);
            totalnum = sc.nextInt();
            imformation= new person[totalnum];
        }

        public void setImformation(String Country) {
                //记录个人基本信息
            Scanner sc=new Scanner(System.in);
                System.out.print("请输入参赛者姓名（英文/中文）：");
                String Name = sc.next();
                System.out.print("请输入参赛者年龄（阿拉伯数字）：");
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
                //遍历数据
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




