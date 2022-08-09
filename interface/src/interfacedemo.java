//某国家的羽毛球和足球的运动员和教练部分要学习英文以出国比赛
//做可连续的登记程序

//接口案例

//要登记18岁的周一凡为中国队的国际化羽毛球球员
//他的教练是38岁的林丹，也要学习英语
//要求：在登记完这两个人的信息后可以分别查询他们的个人信息

import java.util.Scanner;
public class interfacedemo {
    private static Object imformation;

    public static <Char> void main(String[] args) {

        //连续登记的循环

        //记录循环次数
        int looptime=0;

        //初始化数据个数
        int rd=0;

        //建立数据库（数组）
        imformation s = new imformation();
        while (true) {
            looptime++;

            if (looptime == 1){
                //初始化界面
            System.out.println("*******************************欢迎来到全国国际化运动员和教练员的培训基地*******************************");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("                                    请输入1以开始登记，输入0以退出。                                    ");

            //进入开关
            Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();


            //进入程序

            if (start == 1) {

                //记录国籍
                System.out.print("请输入参赛的国家（英文）：");
                String Country = sc.next();

                //记录人数
                System.out.print("请输入参赛的人数（阿拉伯数字）：");
                s.setTotalnum();
                int num = s.getTotalnum();
                for (int x = 0; x < num; x++) {

                    //打印分界线
                        System.out.println();
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("                                      以下输入参赛者" + (x + 1) + "的信息                                     ");
                        System.out.println();

                    //记录基本信息
                    s.setImformation(Country);

                    //记录详细信息
                    while (true) {
                        System.out.println("参赛者的职业是：1.球员  2.教练,请输入对应项前的序号：");
                        int job = sc.nextInt();
                        if (job == 1) {
                            System.out.println("参赛者的专项是：1.羽毛球  2.足球,请输入对应项前的序号：");
                            int subject = sc.nextInt();
                            if (subject == 1) {
                                System.out.println("参赛者是否参与专项训练？1.参加 2.不参加");
                                int t = sc.nextInt();
                                if (t == 1) {
                                    System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                    int l = sc.nextInt();
                                    if (l == 1) {
                                        badmintonathlete p1 = new globalbadmintonathlete();
                                        p1.running();
                                        p1.training();
                                        globalbadmintonathlete p2 = (globalbadmintonathlete) p1;
                                        p2.learnEnglish();
                                    } else if (l == 2) {
                                        badmintonathlete p1 = new globalbadmintonathlete();
                                        p1.running();
                                        p1.training();
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else if (t == 2) {
                                    System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                    int l = sc.nextInt();
                                    if (l == 1) {
                                        badmintoncoach p1 = new globalbadmintoncoach();
                                        p1.teaching();
                                        p1.working();
                                        globalbadmintoncoach p2 = (globalbadmintoncoach) p1;
                                        p2.learnEnglish();
                                    } else if (l == 2) {
                                        badmintonathlete p1 = new badmintonathlete();
                                        p1.running();
                                        p1.training();
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else {
                                    System.out.println("输入错误请重新输入");
                                }                //输入错误
                            } else if (subject == 2) {
                                System.out.println("参赛者是否参与专项训练？1.参加 2.不参加");
                                int t = sc.nextInt();
                                if (t == 1) {
                                    System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                    int l = sc.nextInt();
                                    if (l == 1) {
                                        footballathlete p1 = new globalfootballathlete();
                                        p1.running();
                                        p1.training();
                                        globalfootballathlete p2 = (globalfootballathlete) p1;
                                        p2.learnEnglish();
                                    } else if (l == 2) {
                                        footballathlete p1 = new globalfootballathlete();
                                        p1.running();
                                        p1.training();
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else if (t == 2) {
                                    System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                    int l = sc.nextInt();
                                    if (l == 1) {
                                        footballathlete p1 = new globalfootballathlete();
                                        p1.running();
                                        globalfootballathlete p2 = (globalfootballathlete) p1;
                                        p2.learnEnglish();
                                    } else if (l == 2) {
                                        footballathlete p1 = new footballathlete();
                                        p1.running();
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else {
                                    System.out.println("输入错误请重新输入");
                                }                //输入错误
                            } else {
                                System.out.println("输入错误请重新输入");
                            }                //输入错误
                        } else if (job == 2) {
                            System.out.println("参赛者的专项是：1.羽毛球  2.足球,请输入对应项前的序号：");
                            int subject = sc.nextInt();
                            if (subject == 1) {
                                System.out.println("参赛者是否参与专项训练？1.参加 2.不参加");
                                int t = sc.nextInt();
                                if (t == 1) {
                                    System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                    int l = sc.nextInt();
                                    if (l == 1) {
                                        badmintoncoach p1 = new globalbadmintoncoach();
                                        p1.teaching();
                                        p1.working();
                                        globalbadmintoncoach p2 = (globalbadmintoncoach) p1;
                                        p2.learnEnglish();
                                    } else if (l == 2) {
                                        badmintoncoach p1 = new globalbadmintoncoach();
                                        p1.teaching();
                                        p1.working();
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else if (t == 2) {
                                    System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                    int l = sc.nextInt();
                                    if (l == 1) {
                                        badmintoncoach p1 = new globalbadmintoncoach();
                                        p1.teaching();
                                        globalbadmintoncoach p2 = (globalbadmintoncoach) p1;
                                        p2.learnEnglish();
                                    } else if (l == 2) {
                                        badmintoncoach p1 = new globalbadmintoncoach();
                                        p1.teaching();
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else {
                                    System.out.println("输入错误请重新输入");
                                }                //输入错误
                            } else if (subject == 2) {
                                System.out.println("参赛者是否参与专项训练？1.参加 2.不参加");
                                int t = sc.nextInt();
                                if (t == 1) {
                                    System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                    int l = sc.nextInt();
                                    if (l == 1) {
                                        footballcoach p1 = new globalfootballcoach();
                                        p1.teaching();
                                        p1.working();
                                        globalfootballcoach p2 = (globalfootballcoach) p1;
                                        p2.learnEnglish();
                                    } else if (l == 2) {
                                        footballcoach p1 = new globalfootballcoach();
                                        p1.teaching();
                                        p1.working();
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else if (t == 2) {
                                    System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                    int l = sc.nextInt();
                                    if (l == 1) {
                                        footballcoach p1 = new globalfootballcoach();
                                        p1.teaching();
                                        globalfootballcoach p2 = (globalfootballcoach) p1;
                                        p2.learnEnglish();
                                    } else if (l == 2) {
                                        footballcoach p1 = new globalfootballcoach();
                                        p1.teaching();
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else {
                                    System.out.println("输入错误请重新输入");
                                }   //输入错误
                            }
                        } else {
                            System.out.println("输入错误请重新输入");
                        }//输入错误
                        break;
                    }  //成功进入登记系统

                    //打印报告列表
                    if (x==num-1) {
                        System.out.println("你是否要打印成员报告后退出？1.打印2.不打印");
                        int p = sc.nextInt();
                        if (p == 1) {
                            s.getmember();
                        } else if (p == 2) {
                            break;
                        } else {
                            System.out.println("输入错误请重新输入");
                        }                //输入错误
                    }
                    }
            }          //开始登记
            else if (start == 0) {
                break;
            }     //退出
            else {
                System.out.println("输入错误请重新输入");
            }                     //输入错误
        }
            else {
                //初始化界面
                System.out.println("*******************************欢迎来到全国国际化运动员和教练员的培训基地*******************************");
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.out.println("                         请输入1以开始登记，输入2以咨询参赛者信息，输入0以退出。                         ");

                //进入开关
                Scanner sc = new Scanner(System.in);
                int start = sc.nextInt();


                //进入程序

                if (start == 1) {

                    //记录国籍
                    System.out.print("请输入参赛的国家（英文）：");
                    String Country = sc.next();

                    //记录人数
                    System.out.print("请输入参赛的人数（阿拉伯数字）：");
                    s.setTotalnum();
                    rd=s.getTotalnum();
                    int num = s.getTotalnum();
                    for (int x = 0; x < num; x++) {

                        //打印分界线
                            System.out.println();
                            System.out.println("----------------------------------------------------------------------------------------------------");
                            System.out.println("                                      以下输入参赛者" + (x + 1) + "的信息                                     ");
                            System.out.println();

                        //记录基本信息
                        s.setImformation(Country);

                        //记录详细信息
                        while (true) {
                            System.out.println("参赛者的职业是：1.球员  2.教练,请输入对应项前的序号：");
                            int job = sc.nextInt();
                            if (job == 1) {
                                System.out.println("参赛者的专项是：1.羽毛球  2.足球,请输入对应项前的序号：");
                                int subject = sc.nextInt();
                                if (subject == 1) {
                                    System.out.println("参赛者是否参与专项训练？1.参加 2.不参加");
                                    int t = sc.nextInt();
                                    if (t == 1) {
                                        System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                        int l = sc.nextInt();
                                        if (l == 1) {
                                            badmintonathlete p1 = new globalbadmintonathlete();
                                            p1.running();
                                            p1.training();
                                            globalbadmintonathlete p2 = (globalbadmintonathlete) p1;
                                            p2.learnEnglish();
                                        } else if (l == 2) {
                                            badmintonathlete p1 = new globalbadmintonathlete();
                                            p1.running();
                                            p1.training();
                                        } else {
                                            System.out.println("输入错误请重新输入");
                                        }                //输入错误
                                    } else if (t == 2) {
                                        System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                        int l = sc.nextInt();
                                        if (l == 1) {
                                            badmintoncoach p1 = new globalbadmintoncoach();
                                            p1.teaching();
                                            p1.working();
                                            globalbadmintoncoach p2 = (globalbadmintoncoach) p1;
                                            p2.learnEnglish();
                                        } else if (l == 2) {
                                            badmintonathlete p1 = new badmintonathlete();
                                            p1.running();
                                            p1.training();
                                        } else {
                                            System.out.println("输入错误请重新输入");
                                        }                //输入错误
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else if (subject == 2) {
                                    System.out.println("参赛者是否参与专项训练？1.参加 2.不参加");
                                    int t = sc.nextInt();
                                    if (t == 1) {
                                        System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                        int l = sc.nextInt();
                                        if (l == 1) {
                                            footballathlete p1 = new globalfootballathlete();
                                            p1.running();
                                            p1.training();
                                            globalfootballathlete p2 = (globalfootballathlete) p1;
                                            p2.learnEnglish();
                                        } else if (l == 2) {
                                            footballathlete p1 = new globalfootballathlete();
                                            p1.running();
                                            p1.training();
                                        } else {
                                            System.out.println("输入错误请重新输入");
                                        }                //输入错误
                                    } else if (t == 2) {
                                        System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                        int l = sc.nextInt();
                                        if (l == 1) {
                                            footballathlete p1 = new globalfootballathlete();
                                            p1.running();
                                            globalfootballathlete p2 = (globalfootballathlete) p1;
                                            p2.learnEnglish();
                                        } else if (l == 2) {
                                            footballathlete p1 = new footballathlete();
                                            p1.running();
                                        } else {
                                            System.out.println("输入错误请重新输入");
                                        }                //输入错误
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else {
                                    System.out.println("输入错误请重新输入");
                                }                //输入错误
                            } else if (job == 2) {
                                System.out.println("参赛者的专项是：1.羽毛球  2.足球,请输入对应项前的序号：");
                                int subject = sc.nextInt();
                                if (subject == 1) {
                                    System.out.println("参赛者是否参与专项训练？1.参加 2.不参加");
                                    int t = sc.nextInt();
                                    if (t == 1) {
                                        System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                        int l = sc.nextInt();
                                        if (l == 1) {
                                            badmintoncoach p1 = new globalbadmintoncoach();
                                            p1.teaching();
                                            p1.working();
                                            globalbadmintoncoach p2 = (globalbadmintoncoach) p1;
                                            p2.learnEnglish();
                                        } else if (l == 2) {
                                            badmintoncoach p1 = new globalbadmintoncoach();
                                            p1.teaching();
                                            p1.working();
                                        } else {
                                            System.out.println("输入错误请重新输入");
                                        }                //输入错误
                                    } else if (t == 2) {
                                        System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                        int l = sc.nextInt();
                                        if (l == 1) {
                                            badmintoncoach p1 = new globalbadmintoncoach();
                                            p1.teaching();
                                            globalbadmintoncoach p2 = (globalbadmintoncoach) p1;
                                            p2.learnEnglish();
                                        } else if (l == 2) {
                                            badmintoncoach p1 = new globalbadmintoncoach();
                                            p1.teaching();
                                        } else {
                                            System.out.println("输入错误请重新输入");
                                        }                //输入错误
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }                //输入错误
                                } else if (subject == 2) {
                                    System.out.println("参赛者是否参与专项训练？1.参加 2.不参加");
                                    int t = sc.nextInt();
                                    if (t == 1) {
                                        System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                        int l = sc.nextInt();
                                        if (l == 1) {
                                            footballcoach p1 = new globalfootballcoach();
                                            p1.teaching();
                                            p1.working();
                                            globalfootballcoach p2 = (globalfootballcoach) p1;
                                            p2.learnEnglish();
                                        } else if (l == 2) {
                                            footballcoach p1 = new globalfootballcoach();
                                            p1.teaching();
                                            p1.working();
                                        } else {
                                            System.out.println("输入错误请重新输入");
                                        }                //输入错误
                                    } else if (t == 2) {
                                        System.out.println("参赛者是否学习英语以参加国际比赛？1.参加 2.不参加");
                                        int l = sc.nextInt();
                                        if (l == 1) {
                                            footballcoach p1 = new globalfootballcoach();
                                            p1.teaching();
                                            globalfootballcoach p2 = (globalfootballcoach) p1;
                                            p2.learnEnglish();
                                        } else if (l == 2) {
                                            footballcoach p1 = new globalfootballcoach();
                                            p1.teaching();
                                        } else {
                                            System.out.println("输入错误请重新输入");
                                        }                //输入错误
                                    } else {
                                        System.out.println("输入错误请重新输入");
                                    }   //输入错误
                                }
                            } else {
                                System.out.println("输入错误请重新输入");
                            }//输入错误
                            break;
                        }  //成功进入登记系统

                        //打印报告列表
                        if (x==num-1) {
                            System.out.println("你是否要打印成员报告后退出？1.打印2.不打印");
                            int p = sc.nextInt();
                            if (p == 1) {
                                s.getmember();
                            } else if (p == 2) {
                                break;
                            } else {
                                System.out.println("输入错误请重新输入");
                            }
                            //输入错误
                        }
                        }
                }          //开始登记
                else if (start==2){
                    System.out.print("请输入查询参赛者名称：");
                    String Name=sc.next();
                    for (int x=0;x<rd;x++){
                        if (x==s.getindex(Name)){
                            person p=new person() {
                                @Override
                                public String getName() {
                                    return super.getName();
                                }
                                public int getAge(){
                                    return super.getAge();
                                }
                                public String getCountry(){
                                    return super.getCountry();
                                }
                            };
                            p.showbehavior(p.getCountry(),Name,p.getAge());
                        }
                    }
                }
                else if (start == 0) {
                    break;
                }     //退出
                else {
                    System.out.println("输入错误请重新输入");
                }                     //输入错误
            }
        }
    }
}



