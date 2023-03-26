import java.util.Scanner;

public class FUNCTION3 {
    public static int calculator(int n1, int n2) {
        int sum=n1+n2;
        return sum ;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum= calculator(a,b);
        System.out.println("sum is  :" + sum);

    }
}
