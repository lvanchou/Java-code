//ĳ���ҵ���ë���������˶�Ա�ͽ�������ҪѧϰӢ���Գ�������
//���������ĵǼǳ���

//�ӿڰ���

//Ҫ�Ǽ�18�����һ��Ϊ�й��ӵĹ��ʻ���ë����Ա
//���Ľ�����38����ֵ���ҲҪѧϰӢ��
//Ҫ���ڵǼ����������˵���Ϣ����Էֱ��ѯ���ǵĸ�����Ϣ

import java.util.Scanner;
public class interfacedemo {
    public static <Char> void main(String[] args) {

        //�����Ǽǵ�ѭ��
        while (true) {


            //��ʼ������
            System.out.println("***��ӭ����ȫ�����ʻ��˶�Ա�ͽ���Ա����ѵ����***");
            System.out.println("--------------------------------------------");
            System.out.println("        ������1�Կ�ʼ�Ǽǣ�����0���˳���        ");


            //���뿪��
            Scanner sc = new Scanner(System.in);
            int start = sc.nextInt();


            //�������
            if (start == 0) {
                break;
            }     //�˳�
            else if (start == 1) {

                //��¼����
                System.out.print("��������ң�Ӣ�ģ���");
                String Country = sc.next();

                //��¼����
                System.out.print("������ö����������������֣���");
                int totalnum = sc.nextInt();

                //�������ݿ⣨���飩
                person[] imformation = new person[totalnum];
                for (int x = 0; x < totalnum; x++) {
                    //��¼���˻�����Ϣ
                    System.out.print("������������Ӣ��/���ģ���");
                    String Name = sc.next();
                    System.out.print("���������䣨���������֣���");
                    int Age = sc.nextInt();
                    person p = new person(Name, Age, Country) {
                        @Override
                        public void setName(String name) {
                            super.setName(name);
                        }
                    };

                    imformation[x] = p;

                    //��¼��ϸ��Ϣ
                    while (true) {
                        System.out.println("����ְҵ�ǣ�1.��Ա  2.����,�������Ӧ��ǰ����ţ�");
                        int job = sc.nextInt();
                        if (job == 1) {
                            System.out.println("����ר���ǣ�1.��ë��  2.����,�������Ӧ��ǰ����ţ�");
                            int subject = sc.nextInt();
                            if (subject == 1) {
                                badmintonathlete p1 = new badmintonathlete();
                                System.out.println("�Ƿ����ר��ѵ����1.�μ� 2.���μ�");
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
                                System.out.println("�Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                int t = sc.nextInt();
                                if (t==1) {
                                    p1.running();
                                    p1.training();
                                    break;
                                } else if (t==2) {
                                    p1.running();
                                    break;
                                } else {
                                    System.out.println("�����������������");
                                }                //�������
                            }
                        } else if (job == 2) {
                            System.out.println("����ר���ǣ�1.��ë��  2.����,�������Ӧ��ǰ����ţ�");
                            int subject = sc.nextInt();
                            if (subject == 1) {
                                badmintoncoach p1 = new badmintoncoach();
                                System.out.println("�Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                int t = sc.nextInt();
                                if (t==1) {
                                    p1.teaching();
                                    p1.working();
                                } else if (t==2) {
                                    p1.teaching();
                                }
                            } else if (subject == 2) {
                                footballcoach p1 = new footballcoach();
                                System.out.println("�Ƿ����ר��ѵ����1.�μ� 2.���μ�");
                                int t = sc.nextInt();
                                if (t==1) {
                                    p1.teaching();
                                    p1.working();
                                    break;
                                } else if (t==2) {
                                    p1.teaching();
                                    break;
                                } else {
                                    System.out.println("�����������������");
                                }                //�������
                            } else {
                                System.out.println("�����������������");
                            }   //�������
                        }
                    }
                }  //�ɹ�����Ǽ�ϵͳ
            } else {
                System.out.println("�����������������");
            }                //�������
        }
    }
}



