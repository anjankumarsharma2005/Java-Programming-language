public class BITNN {
    public static int fastExpo(int a, int n){
        int ans=1;
        while(n>0){
            if((n & 1) != 0){
                ans=ans *a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    System.out.println(String args[]){
        System.out.println(fastExpo(3, 5));
    }
}
