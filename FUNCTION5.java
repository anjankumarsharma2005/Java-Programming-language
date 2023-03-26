import java.util.Scanner;

public class FUNCTION5 {
    public static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = :" + a);
        System.out.println("b =:" + b);
    }
    public static void main(String args[]) {
        int a=4;// swap --> value exchange
        int b= 9;
        swap(a, b);
    }
}
