import java.util.Scanner;
public class LOOP4 {
    //Printing  sum of  first  n natural numbers  using while loop
    public static void main(String ARGS[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=1;
        int s=0;
        while(c<=n){
          
          s+=c;
          c++;

        }
        System.out.println("sum of  first " + n+" natural numbers = "+ s);
     }  
}
