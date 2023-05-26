import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
public class Main3 {
    // reverse of arraylist
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       
         // add element 0(1)
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         // Reverse print
         for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i) + " ");
         }
         System.out.println();
    }
}
