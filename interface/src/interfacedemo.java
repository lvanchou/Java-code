//ĳ���ҵ���ë���������˶�Ա�ͽ�������ҪѧϰӢ���Գ�������
//���������ĵǼǳ���

//�ӿڰ���

//Ҫ�Ǽ�18�����һ��Ϊ�й��ӵĹ��ʻ���ë����Ա
//���Ľ�����38����ֵ���ҲҪѧϰӢ��
//Ҫ���ڵǼ����������˵���Ϣ����Էֱ��ѯ���ǵĸ�����Ϣ

import java.util.Scanner;
public class interfacedemo {
    private static Object imformation;

    public static <Char> void main(String[] args) {

        //�����Ǽǵ�ѭ��

        //��¼ѭ������
        int looptime=0;

        //��ʼ�����ݸ���
        int rd=0;

        //�������ݿ⣨���飩
        imformation s = new imformation();
        while (true) {
            looptime++;

            if (looptime == 1){
                //��ʼ������
            System.out.println("*******************************��ӭ����ȫ�����ʻ��˶�Ա�ͽ���Ա����ѵ����*******************************");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("                                    ������1�Կ�ʼ�Ǽǣ�����0���˳���                                    ");

            //���뿪��
            Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();


            //�������

            if (start == 1) {

                //��¼����
                System.out.print("����������Ĺ��ң�Ӣ�ģ���");
                String Country = sc.next();

                //��¼����
                System.out.print("��������������������������֣���");
                s.setTotalnum();
                int num = s.getTotalnum();
                for (int x = 0; x < num; x++) {

                    //��ӡ�ֽ���
                        System.out.println();
                        System.out.println("----------------------------------------------------------------------------------------------------");
                        System.out.println("                                      �������������" + (x + 1) + "����Ϣ                                     ");
                        System.out.println();

                    //��¼������Ϣ
                    s.setImformation(Country);

                    //��¼��ϸ��Ϣ
                    while (true) {
                        System.out.println("�����ߵ�ְҵ�ǣ�1.��Ա  2.����,�������Ӧ��ǰ����ţ�");
                        int job = sc.nextInt();
                        if (job == 1) {
                            System.out.println("�����ߵ�ר���ǣ�1.��ë��  2.����,�������Ӧ��ǰ����ţ�");
                            int subject = sc.nextInt();
                            if (subject == 1) {
                                System.out.println("�������Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                int t = sc.nextInt();
                                if (t == 1) {
                                    System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                        System.out.println("�����������������");
                                    }                //�������
                                } else if (t == 2) {
                                    System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                        System.out.println("�����������������");
                                    }                //�������
                                } else {
                                    System.out.println("�����������������");
                                }                //�������
                            } else if (subject == 2) {
                                System.out.println("�������Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                int t = sc.nextInt();
                                if (t == 1) {
                                    System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                        System.out.println("�����������������");
                                    }                //�������
                                } else if (t == 2) {
                                    System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                        System.out.println("�����������������");
                                    }                //�������
                                } else {
                                    System.out.println("�����������������");
                                }                //�������
                            } else {
                                System.out.println("�����������������");
                            }                //�������
                        } else if (job == 2) {
                            System.out.println("�����ߵ�ר���ǣ�1.��ë��  2.����,�������Ӧ��ǰ����ţ�");
                            int subject = sc.nextInt();
                            if (subject == 1) {
                                System.out.println("�������Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                int t = sc.nextInt();
                                if (t == 1) {
                                    System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                        System.out.println("�����������������");
                                    }                //�������
                                } else if (t == 2) {
                                    System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                        System.out.println("�����������������");
                                    }                //�������
                                } else {
                                    System.out.println("�����������������");
                                }                //�������
                            } else if (subject == 2) {
                                System.out.println("�������Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                int t = sc.nextInt();
                                if (t == 1) {
                                    System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                        System.out.println("�����������������");
                                    }                //�������
                                } else if (t == 2) {
                                    System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                        System.out.println("�����������������");
                                    }                //�������
                                } else {
                                    System.out.println("�����������������");
                                }   //�������
                            }
                        } else {
                            System.out.println("�����������������");
                        }//�������
                        break;
                    }  //�ɹ�����Ǽ�ϵͳ

                    //��ӡ�����б�
                    if (x==num-1) {
                        System.out.println("���Ƿ�Ҫ��ӡ��Ա������˳���1.��ӡ2.����ӡ");
                        int p = sc.nextInt();
                        if (p == 1) {
                            s.getmember();
                        } else if (p == 2) {
                            break;
                        } else {
                            System.out.println("�����������������");
                        }                //�������
                    }
                    }
            }          //��ʼ�Ǽ�
            else if (start == 0) {
                break;
            }     //�˳�
            else {
                System.out.println("�����������������");
            }                     //�������
        }
            else {
                //��ʼ������
                System.out.println("*******************************��ӭ����ȫ�����ʻ��˶�Ա�ͽ���Ա����ѵ����*******************************");
                System.out.println("----------------------------------------------------------------------------------------------------");
                System.out.println("                         ������1�Կ�ʼ�Ǽǣ�����2����ѯ��������Ϣ������0���˳���                         ");

                //���뿪��
                Scanner sc = new Scanner(System.in);
                int start = sc.nextInt();


                //�������

                if (start == 1) {

                    //��¼����
                    System.out.print("����������Ĺ��ң�Ӣ�ģ���");
                    String Country = sc.next();

                    //��¼����
                    System.out.print("��������������������������֣���");
                    s.setTotalnum();
                    rd=s.getTotalnum();
                    int num = s.getTotalnum();
                    for (int x = 0; x < num; x++) {

                        //��ӡ�ֽ���
                            System.out.println();
                            System.out.println("----------------------------------------------------------------------------------------------------");
                            System.out.println("                                      �������������" + (x + 1) + "����Ϣ                                     ");
                            System.out.println();

                        //��¼������Ϣ
                        s.setImformation(Country);

                        //��¼��ϸ��Ϣ
                        while (true) {
                            System.out.println("�����ߵ�ְҵ�ǣ�1.��Ա  2.����,�������Ӧ��ǰ����ţ�");
                            int job = sc.nextInt();
                            if (job == 1) {
                                System.out.println("�����ߵ�ר���ǣ�1.��ë��  2.����,�������Ӧ��ǰ����ţ�");
                                int subject = sc.nextInt();
                                if (subject == 1) {
                                    System.out.println("�������Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                    int t = sc.nextInt();
                                    if (t == 1) {
                                        System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                            System.out.println("�����������������");
                                        }                //�������
                                    } else if (t == 2) {
                                        System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                            System.out.println("�����������������");
                                        }                //�������
                                    } else {
                                        System.out.println("�����������������");
                                    }                //�������
                                } else if (subject == 2) {
                                    System.out.println("�������Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                    int t = sc.nextInt();
                                    if (t == 1) {
                                        System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                            System.out.println("�����������������");
                                        }                //�������
                                    } else if (t == 2) {
                                        System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                            System.out.println("�����������������");
                                        }                //�������
                                    } else {
                                        System.out.println("�����������������");
                                    }                //�������
                                } else {
                                    System.out.println("�����������������");
                                }                //�������
                            } else if (job == 2) {
                                System.out.println("�����ߵ�ר���ǣ�1.��ë��  2.����,�������Ӧ��ǰ����ţ�");
                                int subject = sc.nextInt();
                                if (subject == 1) {
                                    System.out.println("�������Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                    int t = sc.nextInt();
                                    if (t == 1) {
                                        System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                            System.out.println("�����������������");
                                        }                //�������
                                    } else if (t == 2) {
                                        System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                            System.out.println("�����������������");
                                        }                //�������
                                    } else {
                                        System.out.println("�����������������");
                                    }                //�������
                                } else if (subject == 2) {
                                    System.out.println("�������Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                    int t = sc.nextInt();
                                    if (t == 1) {
                                        System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                            System.out.println("�����������������");
                                        }                //�������
                                    } else if (t == 2) {
                                        System.out.println("�������Ƿ�ѧϰӢ���Բμӹ��ʱ�����1.�μ� 2.���μ�");
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
                                            System.out.println("�����������������");
                                        }                //�������
                                    } else {
                                        System.out.println("�����������������");
                                    }   //�������
                                }
                            } else {
                                System.out.println("�����������������");
                            }//�������
                            break;
                        }  //�ɹ�����Ǽ�ϵͳ

                        //��ӡ�����б�
                        if (x==num-1) {
                            System.out.println("���Ƿ�Ҫ��ӡ��Ա������˳���1.��ӡ2.����ӡ");
                            int p = sc.nextInt();
                            if (p == 1) {
                                s.getmember();
                            } else if (p == 2) {
                                break;
                            } else {
                                System.out.println("�����������������");
                            }
                            //�������
                        }
                        }
                }          //��ʼ�Ǽ�
                else if (start==2){
                    System.out.print("�������ѯ���������ƣ�");
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
                }     //�˳�
                else {
                    System.out.println("�����������������");
                }                     //�������
            }
        }
    }
}



