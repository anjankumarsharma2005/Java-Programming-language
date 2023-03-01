//Conditional statement:-->if-else
// Print largest of two no.
import java.util.Scanner;
public class JAVA36 {
    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        System.out.println("Enter 1st no ="+ n1);
        System.out.println("Enter 1st no ="+ n2);
        if (n1>n2){
            System.out.println("n1 is larger as compared to n2");
        }
        if(n1==n2){
            System.out.println("n1 is equal  to n2");
        }
        else{
            System.out.println("n2 is larger as compared to n1");
        }
    }
}