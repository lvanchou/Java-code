public class test {
    public static void main(String[] args) {
        outer.method().show();
    }
}

interface inter{
    void show();
}

class  outer {
    //��ȫ����
    public static inter method() {
        return new inter() {
            public void show() {
                System.out.println("Helloworld");
            }
        };
    }
        }