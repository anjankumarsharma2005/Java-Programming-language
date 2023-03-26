import java.util.Scanner;
public class FUNCTION1 {
    public static void calculator(int n1, int n2) {
        int a = n1 + n2;
        System.out.println("sum is :" + a);
        return;
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        calculator(c,d);
    }
}
