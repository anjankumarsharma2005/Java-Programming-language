import java.util.Scanner;

public class LOOP7 {
    // reverse of a given no
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("The given number is "+ n);
        int rev=0;

        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+ lastDigit;
            
            n=n/10;
        }
        System.out.println("Reverse of the given number is "+rev);
    }
    
}
