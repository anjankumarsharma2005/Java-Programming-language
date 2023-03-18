import java.util.Scanner;
public class LOOP11 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        do{
            int n=sc.nextInt();
            System.out.println("enter your number ="+n);
            
            if(n%10==0){
                continue;
            }
            System.out.println("no was :"+n);
        }while(true);
    }
}
