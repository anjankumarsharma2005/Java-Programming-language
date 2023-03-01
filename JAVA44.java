import java.util.Scanner;
public class JAVA44 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter a ="+ a);
        int b=sc.nextInt();
        System.out.println("enter b =" + b);
        char operator=sc.next().charAt(0);
        System.out.println("enter operator : " + operator);
        
        switch(operator){
            case '+' :System.out.println("sum of a and b ="+(a+b));
                      break;
            case '-' :System.out.println("subtract of a and b ="+(a-b));
                      break;
            case '*' :System.out.println("multiply of a and b ="+(a*b));
                      break;
            case '/':System.out.println("divide of a and b  ="+(a/b));
                      break;
            default :System.out.println("wrong operator");
        }
    }
}
