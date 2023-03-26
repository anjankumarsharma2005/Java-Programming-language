public class FUNCTION10 {
    public static float sum( Float a, Float b){
        return a+b;   
   }
   public static float sum( Float a, Float b, Float c){
       return a+b+c; 
  }
  public static void main(String args[]){
   System.out.println(sum(4.4f, .2f));
   System.out.println(sum(150.2f, 42.3f, 25.45f));
  }
}
