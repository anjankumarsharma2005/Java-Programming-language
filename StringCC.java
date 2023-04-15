import java.util.*;
public class StringCC {
    public static void printLetters(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        // concatenation--> adding two string
        Scanner sc=new Scanner(System.in);
        String Fname="anjan";
        String Lname="sharma";
        String Fullname=Fname+ " "+ Lname;
        //extracting each charater from string
       // System.out.println(Fullname.charAt(0));
        printLetters(Fullname);
    }
}
