//����������Ϊ�ˣ�һ������Ϊ�˶�Ա�ͽ���������Ϊ��ë�������
//��Ϊ�����඼�����֣����䣬��������Ҫ�Է���˯����

//����
public abstract class person {

 //�����Ա����
 private String Name;
 private int Age;
 static int x=0;
 //ĳ���ҶӵĹ�����ͳһ�ģ��þ�̬����
 private static String Country;

 //���幹�췽�����޲Σ����Σ�
 public person(){}

 public person(String Name,int Age,String Country){
  this.Name=Name;
  this.Age=Age;
  this.Country=Country;
 }

 //set,get����
  public void setName(String name) {
  Name = name;
 }

 public String getName() {
  return Name;
 }

 public void setAge(int age) {
  Age = age;
 }

 public int getAge() {
  return Age;
 }

 public void setCountry(String country) {
  Country = country;
 }

 public String getCountry() {
  return Country;
 }

 //���ص�ֵַΪ�ַ�
 @Override
 public String toString() {
  x++;
  return "                                ������"+x+"����Ϣ��" + "������'" + Name + '\'' + ", ���䣺" + Age +"���ң�'"+Country+ '\''+"                                "+'\n';
 }

 //�Է�˯������
 public void eat(){
  System.out.println("���������Ǹ֣�һ�ٲ��Զ��ûš�");
 }

 public void sleep(){
  System.out.println("��ϢƬ�̣����ϻ�����");
 }

 //չʾ������Ϣ�ķ���
 public void showbehavior(String Country,String Name,int Age){
  System.out.println("�ò�������Ϣ��");
  System.out.println("���ң�"+Country+"    "+"������"+Name+"    "+"����"+"    "+Age);
  System.out.println("������Ϊ��");
  eat();
  sleep();
  System.out.println("�ر���Ϊ��");

 }
}


//����

//����1

abstract class athlete extends person{
 //�����ٶ����Ա����,��Ϊ�����е��㹻��
 //��Ҫ���췽��
 public athlete(){
  super();
 }

 public athlete(String Name,int Age,String Country){
  super(Name,Age,Country);
 }

 //ÿ�춼Ҫ����ѵ��������
 public void running(){
  System.out.println("��־����������ȡʤ�Ĺؼ�");
 }

 //ÿ�춼��ר��ѵ��
 abstract public void training();
}

//����2

abstract class coach extends person{
 //�����ٶ����Ա����,��Ϊ�����е��㹻��
 //��Ҫ���췽��
 public coach(){
  super();
 }

 public coach(String Name, int Age, String Country){
  super(Name,Age,Country);
 }

 //ÿ�춼Ҫ�������˵�����
 public void teaching(){
  System.out.println("ʦ�ߣ����Դ�����������Ҳ");
 }

 //ÿ�춼��ר���������
 abstract public void working();
}


//�����ټ̳�

//�����ټ̳�1

class badmintonathlete extends athlete{
 //�����ٶ����Ա����,��Ϊ�����е��㹻��
 //��Ҫ���췽��
  public badmintonathlete(){
   super();
   eat();
   sleep();
  }

  public badmintonathlete(String Name, int Age, String Country){
   super(Name,Age,Country);
  }

  //ÿ�춼Ҫ����ë�������
  public void training(){
   System.out.println("һ��ɱ��һ������");
  }
}

//�����ټ̳�2

class footballathlete extends athlete{
 //�����ٶ����Ա����,��Ϊ�����е��㹻��
 //��Ҫ���췽��
 public footballathlete(){
  super();
  eat();
  sleep();
 }

 public footballathlete(String Name, int Age, String Country){
  super(Name,Age,Country);
 }

 //ÿ�춼Ҫ�����������
 public void training(){
  System.out.println("����һ�ţ����Ŷ���");
 }
}

//�����ټ̳�3

class badmintoncoach extends coach{
 //�����ٶ����Ա����,��Ϊ�����е��㹻��
 //��Ҫ���췽��
 public badmintoncoach(){
  super();
  eat();
  sleep();
 }

 public badmintoncoach(String Name, int Age, String Country){
  super(Name,Age,Country);
 }

 //ÿ�춼Ҫ����ë�������
 public void working(){
  System.out.println("�������ң���η����");
 }
}

//�����ټ̳�4

class footballcoach extends coach{
 //�����ٶ����Ա����,��Ϊ�����е��㹻��
 //��Ҫ���췽��
 public footballcoach(){
  super();
  eat();
  sleep();
 }

 public footballcoach(String Name, int Age, String Country){
  super(Name,Age,Country);
 }

 //ÿ�춼Ҫ�����������
 public void working(){
  System.out.println("�������ң���η����");
 }
}


//�ӿ�
//ѧӢ����������

interface globalization{
 public abstract void learnEnglish();
}

//��ʵ�ֽӿ�
//ѧӢ��

class globalbadmintonathlete  extends badmintonathlete implements globalization {
 public void learnEnglish(){
  System.out.println("���Ҷ���ë����Ա����ȫ����");
 }
}

class globalfootballathlete extends footballathlete implements globalization {
 public void learnEnglish(){
  System.out.println("���Ҷ�������Ա����ȫ����");
 }
}

class globalbadmintoncoach extends badmintoncoach implements globalization {
 public void learnEnglish(){
  System.out.println("���Ҷ���ë�����Ա����ȫ����");
 }
}

class globalfootballcoach extends footballcoach implements globalization {
 public void learnEnglish(){
  System.out.println("���Ҷ��������Ա����ȫ����");
 }
}