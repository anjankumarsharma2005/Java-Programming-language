import java.util.Scanner;

//Conditional statement:-->else-if 
// Checking largest among 3 numbers
public class JAVA40{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Entered value of a ="+ a);
        System.out.println("Entered value of b ="+ b);
        System.out.println("Entered value of c ="+ c);
        if(a>=b && a>=c){
            System.out.println("a is largest no among 3 given numbers");
        }
        else if(b>=c ){
            System.out.println("b is largest no among 3 given numbers");
        }
        else{
            System.out.println("b is largest no among 3 given numbers");
        }

    }
}
