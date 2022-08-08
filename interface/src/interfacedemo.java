//某国家的羽毛球和足球的运动员和教练部分要学习英文以出国比赛
//做可连续的登记程序

//接口案例

//要登记18岁的周一凡为中国队的国际化羽毛球球员
//他的教练是38岁的林丹，也要学习英语
//要求：在登记完这两个人的信息后可以分别查询他们的个人信息

import java.util.Scanner;
public class interfacedemo {
    public static <Char> void main(String[] args) {

        //连续登记的循环
        while (true) {


            //初始化界面
            System.out.println("***欢迎来到全国国际化运动员和教练员的培训基地***");
            System.out.println("--------------------------------------------");
            System.out.println("        请输入1以开始登记，输入0以退出。        ");


            //进入开关
            Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();


            //进入程序
            if (start == 0) {
                break;
            }     //退出
            else if (start == 1) {

                //记录国籍
                System.out.print("请输入国家（英文）：");
                String Country = sc.next();

                //记录人数
                System.out.print("请输入该队人数（阿拉伯数字）：");
                int totalnum = sc.nextInt();

                //建立数据库（数组）
                person[] imformation = new person[totalnum];
                for (int x = 0; x < totalnum; x++) {
                    //记录个人基本信息
                    System.out.print("请输入姓名（英文/中文）：");
                    String Name = sc.next();
                    System.out.print("请输入年龄（阿拉伯数字）：");
                    int Age = sc.nextInt();
                    person p = new person(Name, Age, Country) {
                        @Override
                        public void setName(String name) {
                            super.setName(name);
                        }
                    };

                    imformation[x] = p;

                    //记录详细信息
                    while (true) {
                        System.out.println("您的职业是：1.球员  2.教练,请输入对应项前的序号：");
                        int job = sc.nextInt();
                        if (job == 1) {
                            System.out.println("您的专项是：1.羽毛球  2.足球,请输入对应项前的序号：");
                            int subject = sc.nextInt();
                            if (subject == 1) {
                                badmintonathlete p1 = new badmintonathlete();
                                System.out.println("是否参与专项训练？1.参加 2.不参加");
                                int t = sc.nextInt();
                                if (t==1) {
                                    p1.running();
                                    p1.training();
                                } else if (t==2) {
                                    p1.running();
                                }
                                break;
                            } else if (subject == 2) {
                                footballathlete p1 = new footballathlete();
                                System.out.println("是否参与专项训练？1.参加 2.不参加");
                                int t = sc.nextInt();
                                if (t==1) {
                                    p1.running();
                                    p1.training();
                                    break;
                                } else if (t==2) {
                                    p1.running();
                                    break;
                                } else {
                                    System.out.println("输入错误请重新输入");
                                }                //输入错误
                            }
                        } else if (job == 2) {
                            System.out.println("您的专项是：1.羽毛球  2.足球,请输入对应项前的序号：");
                            int subject = sc.nextInt();
                            if (subject == 1) {
                                badmintoncoach p1 = new badmintoncoach();
                                System.out.println("是否参与专项训练？1.参加 2.不参加");
                                int t = sc.nextInt();
                                if (t==1) {
                                    p1.teaching();
                                    p1.working();
                                } else if (t==2) {
                                    p1.teaching();
                                }
                            } else if (subject == 2) {
                                footballcoach p1 = new footballcoach();
                                System.out.println("是否参与专项训练？1.参加 2.不参加");
                                int t = sc.nextInt();
                                if (t==1) {
                                    p1.teaching();
                                    p1.working();
                                    break;
                                } else if (t==2) {
                                    p1.teaching();
                                    break;
                                } else {
                                    System.out.println("输入错误请重新输入");
                                }                //输入错误
                            } else {
                                System.out.println("输入错误请重新输入");
                            }   //输入错误
                        }
                    }
                }  //成功进入登记系统
            } else {
                System.out.println("输入错误请重新输入");
            }                //输入错误
        }
    }
}



