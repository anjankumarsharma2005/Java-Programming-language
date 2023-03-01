//Conditional statement:--> if-else statements
// Print if a number is odd or even
import java.util.Scanner;
public class JAVA37 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Number = "+ n);
        if (n%2==0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}

