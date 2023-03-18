import java.util.Scanner;

public class LOOP3 {
    //Printing numbers from 1 to n using while loop
   public static void main(String ARGS[]) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int c=1;
      while(c<=n){
        System.out.println(c);
        c++;
      }
      System.out.println();
   }
}
