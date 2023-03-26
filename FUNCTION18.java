import java.util.Scanner;
public class FUNCTION18 {
    public static void main(String args[]) {
        System.out.println("please enter a no : ");
        Scanner sc=new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)){


            System.out.println("NUMBER : " +palindrome+ " is a palindrome");
        }else{
            System.out.println("NUMBER : " +palindrome+ " is not a palindrome");
        }
    }
    public static boolean isPalindrome(int number){
        int palindrome=number;
        int reverse=0;

        while(palindrome!=0){
            int reminder=palindrome%10;
            reverse=reverse*10 + reminder;
            palindrome=palindrome/10;
        }
        if(number ==reverse){
            return true;
        }
        return false;
    }
}
