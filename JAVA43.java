import java.util.Scanner;
//switch conditional satements
public class JAVA43 {
    public static void main(String args[]) {
        int n=3;
        switch(n){
            case 1 :System.out.println("monday");
                      break;
            case 2 :System.out.println("tuesday or thursday");
                      break;
            case 3 :System.out.println("saturday or sunday");
                      break;
            case 4:System.out.println("friday");
                      break;
            default :System.out.println("wrong input");
        }
    }
}
