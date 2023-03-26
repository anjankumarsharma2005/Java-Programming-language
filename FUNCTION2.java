import java.util.Scanner;
public class FUNCTION2 {
    public static void calculator() {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        int sum=c+d;
        int sub=c-d;
        int mul=c*d;
        int div=c/d;
        System.out.println("sum is  :" + sum);
        System.out.println("sub is  :" + sub);
        System.out.println("mul is  :" + mul);
        System.out.println("div is  :" + div);
    }
    public static void main(String args[]){
        calculator();
    }
}
