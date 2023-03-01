import java.util.Scanner;
//Conditional statement:-->if-else
// Checking voting eligibility
public class JAVA35 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        System.out.println("Enter age ="+ age);
        if(age>=18){
            System.out.println("You are an  adult and you can vote.");
        }
        if(age>13 && age<18){
            System.out.println("You are a teenager and you can't vote.");
        }
        else{
            System.out.println("You are  not an  adult and you can't vote.");
        }
    }
}
