import java.util.Scanner;

public class FUNCTION19 {
   public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.print("input an integer : ");
     int digits=sc.nextInt();
     System.out.println("the sum of " + sumdigits(digits));
   }
   public static int sumdigits(int n) {
     int sumofdigits=0;
     while(n>0){
        int lastdigit=n%10;
        sumofdigits +=lastdigit;
        n/=10;
     }
     return sumofdigits;
   }

}
