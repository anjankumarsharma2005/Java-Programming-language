import java.util.Scanner;
public class LOOP12 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if (n==2){
            System.out.println("n is prime no");

        }else{
            boolean isPrime =true;
            for(int i=2;i<=Math.sqrt(n);i++){
                if (n % i==0){
                    isPrime = false;
                }
            }
            if(isPrime == true){
                System.out.println("n is prime no");
            }else{
                System.out.println("n is  not prime no");  
            }
        }
    }
}
