import java.util.ArrayList;
public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       
         // find max element in arraylist
         list.add(2);
         list.add(5);
         list.add(9);
         list.add(3);
         list.add(6);
         System.out.println(list);
         int max= Integer.MIN_VALUE;
         for(int i=0; i<list.size(); i++){
            if(max<list.get(i)){
                max =list.get(i);
            }
         }
         System.out.println("max element = "+ max);
    }
}
