import java.util.Scanner;

public class LOOP14 {
    //Write a program that reads a set of integers,
    //andthen  prints the sum of the even and odd integers.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
         int numbers;
         int choice;
         int evenSum=0;
         int oddSum =0;
         do{
            System.out.println("Enter the number :");
            numbers=sc.nextInt();
            if(numbers %2==0){
                evenSum +=numbers;
            }else{
                oddSum +=numbers;
            }
              System.out.println(" Do you want to continue ? Press 1 for yes or 0 for no");  
        
         } 
         choice=sc.nextInt();
         while( choice==1){
            
            
            System.out.println("Sum of even numbers: ");
            System.out.println("Sum of odd numbers: ");
        }

    }
}
