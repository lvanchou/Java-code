public class test {
    public static void main(String[] args) {
        outer.method.show();
    }
}

interface inter{
    void show();
}

class  outer {
    //��ȫ����
 inter a=new inter(){
     
    };
}