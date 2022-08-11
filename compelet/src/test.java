public class test {
    public static void main(String[] args) {
        outer.method.show();
    }
}

interface inter{
    void show();
}

class  outer {
    //²¹È«´úÂë
 inter a=new inter(){
     
    };
}