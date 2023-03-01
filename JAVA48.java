import java.util.Scanner;

public class JAVA48 {
    /*CONDITIONAL STATEMENTS QUESTIONS
    Question1:
    Write a Java program that takes a year from the user and print whether that year is a leap year or not.*/
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String day =sc.next();
        
        switch(day)
        {case"m":
         case "M":System.out.println("Monday");
                  break;
         case"t":
         case "T":System.out.println("Tuesday\nThursday");
                 break;
         case"w":
         case "W":System.out.println("Wednesday");
                  break;
         case"f":
         case "F":System.out.println("Friday");
                  break ;
         case"s":
         case "S":System.out.println("Saturday\nSunday");
                  break;
        
        default :
           System.out.println("Sorry! You Have entered incorrect input");
        
     }
  } 
}