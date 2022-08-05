public class test {
    public static void main(String[] args) {
        int secret=12111111;
        int intlized= (int) (secret/Math.pow(10,7));
        //intlized= (int) ((int) (secret-intlized*Math.pow(10,7))/Math.pow(10,6));
        System.out.println(intlized);


        int head= (int) (intlized*Math.pow(10,7));
        intlized= (int) (secret-head/Math.pow(10,6));
        System.out.println(intlized);
    }
}
