import java.util.Scanner;
//Conditional statement:-->else-if 
// Income tax calculator
public class JAVA39{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int income =sc.nextInt();
        int tax;
        System.out.println("Enter value of income ="+ income);
        if(income<500000){
            tax=0;
        }
        else if(income>500000 && income<1000000){
            tax=(int) ( income * 0.2);
        }
        else{
            tax=(int) ( income * 0.3);
        }
       System.out.println("Your tax  is " + (tax));
       System.out.println("Your Net income after tax payment is " + (income-tax));
    }
}
