import java.util.Scanner;

public class JAVA45 {
    /*CONDITIONAL STATEMENTS QUESTIONS
    Question1:
    Write a Java program to get a number from the user and print whether it is positive or negative */
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n>0){
             System.out.println("This is a postive no");
        }
        else if (n<0){
            System.out.println("This is a negative no");
       }
       else {
        System.out.println("This  no is zero.");
   }
         
    }
}
