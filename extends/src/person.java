//继承

//父类
class person {
    private String Name;
    private  int Age;

    public person(){}

    public person(String Name, int Age){
        this.Name=Name;
        this.Age=Age;
    }

    public void setName(String Name){
        this.Name=Name;
    }

    public void setAge(int Age){
        this.Age=Age;
    }

    public String getName(){
        return Name;
    }

    public int getAge(){
        return Age;
    }

    public void show(){
        System.out.println(Name+"---"+Age);
    }
}

//子类
class student extends person{

    public student(){
        super();
    }

    public student(String Name,int Age){
        super(Name,Age);
    }
}

class teacher extends person{

    public teacher() {
        super();
    }

    public teacher(String Name,int Age){
        super(Name,Age);
    }
}

