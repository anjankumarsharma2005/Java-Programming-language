public class FUNCTION12 {
   public static boolean isPrime(int n) {
       for (int i=2; i<=n-i;i++){
            if (n%i==0){
                return false;
            }
      }
       return true;
  }
  public static void main(String args[]) {
     System.out.println(isPrime(3));
  }
}