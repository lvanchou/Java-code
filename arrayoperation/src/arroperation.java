// ����Ԫ����������һ�γ��֣�

import java.util.Scanner;
public class arroperation {
    public static int search(int []arr,int putin){
        //int index=-1;
       for(int x=0;x< arr.length;x++){
            if(arr[x]==putin){
                return x;
                /*index=x;
                break;*/
            }
        }
       return -1;
        //return index;
    }

    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6,7,8,9,10,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("����Ҫ��ѯ������Ԫ�أ�");
        int num=sc.nextInt();
        System.out.println("����Ϊ��"+search(arr1,num));
    }
}
