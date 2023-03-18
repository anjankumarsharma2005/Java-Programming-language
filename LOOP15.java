import java.util.Scanner;
public class LOOP15 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n;
        int fact=1;
        System.out.print("enter any positive no : ");
        n=sc.nextInt();
        for(int i=1; i<=n; i++){
            fact *=i;
        }
        System.out.println("factorial of given no is : " + fact);
    }
}
