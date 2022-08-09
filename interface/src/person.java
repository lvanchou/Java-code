//分析：父类为人，一层子类为运动员和教练，二层为羽毛球和足球。
//人为抽象类都有名字，年龄，国籍；都要吃饭和睡觉。

//父类
public abstract class person {

 //定义成员变量
 private String Name;
 private int Age;
 static int x=0;
 //某国家队的国籍是统一的，用静态方法
 private static String Country;

 //定义构造方法（无参，带参）
 public person(){}

 public person(String Name,int Age,String Country){
  this.Name=Name;
  this.Age=Age;
  this.Country=Country;
 }

 //set,get方法
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

 //重载地址值为字符
 @Override
 public String toString() {
  x++;
  return "                                参赛者"+x+"的信息：" + "姓名：'" + Name + '\'' + ", 年龄：" + Age +"国家：'"+Country+ '\''+"                                "+'\n';
 }

 //吃饭睡觉方法
 public void eat(){
  System.out.println("人是铁饭是钢，一顿不吃饿得慌。");
 }

 public void sleep(){
  System.out.println("休息片刻，马上回来。");
 }

 //展示基本信息的方法
 public void showbehavior(String Country,String Name,int Age){
  System.out.println("该参赛者信息：");
  System.out.println("国家："+Country+"    "+"姓名："+Name+"    "+"年龄"+"    "+Age);
  System.out.println("基本行为：");
  eat();
  sleep();
  System.out.println("特别行为：");

 }
}


//子类

//子类1

abstract class athlete extends person{
 //不用再定义成员变量,因为父类中的足够了
 //需要构造方法
 public athlete(){
  super();
 }

 public athlete(String Name,int Age,String Country){
  super(Name,Age,Country);
 }

 //每天都要体能训练的特性
 public void running(){
  System.out.println("意志力与耐力是取胜的关键");
 }

 //每天都有专项训练
 abstract public void training();
}

//子类2

abstract class coach extends person{
 //不用再定义成员变量,因为父类中的足够了
 //需要构造方法
 public coach(){
  super();
 }

 public coach(String Name, int Age, String Country){
  super(Name,Age,Country);
 }

 //每天都要教书育人的特性
 public void teaching(){
  System.out.println("师者，所以传其道解其惑者也");
 }

 //每天都有专项教育工作
 abstract public void working();
}


//子类再继承

//子类再继承1

class badmintonathlete extends athlete{
 //不用再定义成员变量,因为父类中的足够了
 //需要构造方法
  public badmintonathlete(){
   super();
   eat();
   sleep();
  }

  public badmintonathlete(String Name, int Age, String Country){
   super(Name,Age,Country);
  }

  //每天都要打羽毛球的特性
  public void training(){
   System.out.println("一拍杀球，一锤定音");
  }
}

//子类再继承2

class footballathlete extends athlete{
 //不用再定义成员变量,因为父类中的足够了
 //需要构造方法
 public footballathlete(){
  super();
  eat();
  sleep();
 }

 public footballathlete(String Name, int Age, String Country){
  super(Name,Age,Country);
 }

 //每天都要踢足球的特性
 public void training(){
  System.out.println("临门一脚，破门而入");
 }
}

//子类再继承3

class badmintoncoach extends coach{
 //不用再定义成员变量,因为父类中的足够了
 //需要构造方法
 public badmintoncoach(){
  super();
  eat();
  sleep();
 }

 public badmintoncoach(String Name, int Age, String Country){
  super(Name,Age,Country);
 }

 //每天都要教羽毛球的特性
 public void working(){
  System.out.println("羽球有我，无畏风雨");
 }
}

//子类再继承4

class footballcoach extends coach{
 //不用再定义成员变量,因为父类中的足够了
 //需要构造方法
 public footballcoach(){
  super();
  eat();
  sleep();
 }

 public footballcoach(String Name, int Age, String Country){
  super(Name,Age,Country);
 }

 //每天都要教足球的特性
 public void working(){
  System.out.println("足球有我，无畏险阻");
 }
}


//接口
//学英语出国打比赛

interface globalization{
 public abstract void learnEnglish();
}

//类实现接口
//学英语

class globalbadmintonathlete  extends badmintonathlete implements globalization {
 public void learnEnglish(){
  System.out.println("国家队羽毛球球员走向全世界");
 }
}

class globalfootballathlete extends footballathlete implements globalization {
 public void learnEnglish(){
  System.out.println("国家队足球球员走向全世界");
 }
}

class globalbadmintoncoach extends badmintoncoach implements globalization {
 public void learnEnglish(){
  System.out.println("国家队羽毛球教练员走向全世界");
 }
}

class globalfootballcoach extends footballcoach implements globalization {
 public void learnEnglish(){
  System.out.println("国家队足球教练员走向全世界");
 }
}