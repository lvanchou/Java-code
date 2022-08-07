public class extendstest {
    public static void main(String[] args) {
        student s= new student("zyf",17);
        //s.setName("zyf");
        //s.setAge(18);
        System.out.println(s.getName()+"---"+s.getAge());
        System.out.println("---------------------------");
        s.show();

        System.out.println("---------------------------");

        teacher t=new teacher();
        t.setName("ly");
        t.setAge(30);
        System.out.println(t.getName()+"---"+t.getAge());
        System.out.println("---------------------------");
        t.show();
    }
}
