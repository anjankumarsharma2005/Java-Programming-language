import java.util.Scanner;

public class LOOP9 {
    //keep entering no till user enters a multiple of 10
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        do{
            int n=sc.nextInt();
            System.out.println("enter your number ="+n);
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
