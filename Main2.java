import java.lang.reflect.Array;
import java.util.*;
import java.util.ArrayList;
public class Main2 {
    
        public static void main(String[] args) {
          ArrayList<Integer> list = new ArrayList<>();
          ArrayList<String> list1 = new ArrayList<>();
          ArrayList<Boolean> list2 = new ArrayList<>();
           // add element 0(1)
           list.add(1);
           list.add(2);
           list.add(3);
           list.add(4);
           list.add(5);
          System.out.println(list.size());
          // print the arraylist
          for( int i=0; i<list.size(); i++){
            System.out.print(list.get(i) +" ");
          }
          System.out.println();
        }
    
}