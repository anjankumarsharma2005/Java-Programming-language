import java.util.Scanner;

public class FUNCTION16 {//average of 3 no
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(avg(a,b,c));
    }
    public static  double avg(  Double a,  Double b, Double c) {
        return (a+b+c)/3;
    }
    
}
