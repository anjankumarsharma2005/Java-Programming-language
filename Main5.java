import java.util.ArrayList;
public class Main5 {
    public static void swap(ArrayList<Integer>list, int idx1, int idx2){
       int temp =list.get(idx1);
       list.set(idx1,list.get(idx2));
       list.set(idx2,temp);
    }
    public static void main(String[] args) {
        
       ArrayList<ArrayList<Integer>> mainList= new ArrayList<>();
       ArrayList<Integer> list1 = new ArrayList<>();
       ArrayList<Integer> list2 = new ArrayList<>();
       ArrayList<Integer> list3 = new ArrayList<>();

       for(int i=1; i<=5;i++){
         list1.add(i*1);
         list2.add(i*2);
         list3.add(i*3);
       }
       mainList.add(list1);
       mainList.add(list2);
       mainList.add(list3);
       System.out.println(mainList)  ;
        // nested list
        for(int i=0; i< mainList.size();i++){
            ArrayList<Integer>currList= mainList.get(i);
            for (int j=0; j< currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
