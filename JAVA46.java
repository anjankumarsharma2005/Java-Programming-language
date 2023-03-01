import java.util.Scanner;

public class JAVA46 {
    /*CONDITIONAL STATEMENTS QUESTIONS
    Question 2:
    Write a Java program to get You have a fever if your temperature is above 100 and otherwise prints
     You don't have a fever.*/
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int temperature=sc.nextInt();
        if (temperature>100){
             System.out.println("You have a fever");
        }
       else {
        System.out.println("You don't have a fever.");
   }
         
    }
}