import java.util.Scanner;

public class JAVA42 {
    
        //Ternary Operetor
        // check if a student is pass or fail
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in);
            int marks = sc.nextInt();

            String type =(marks>=33)? "pass" :"fail";
            System.out.println(type);
    
        }
    
    
}
