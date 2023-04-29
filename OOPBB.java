

public class OOPBB {
         
        public static void main(String args[]){
            String username;
            BankAccount myAcc=new BankAccount();
            myAcc.username ="anjan kumar sharma";
            myAcc.setPassword("abca");
        }
}
    class BankAccount{
        public String Username;
        private String password;
        public  void setPassword(String pwd) {
            password=pwd;
        }
    }

