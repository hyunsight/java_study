package ch11.sec06;

public class AccountExample {
    public static void main(String[] args) throws InsufficientException{
        Account account = new Account();

        //예금
        account.deposit(10000);
        System.out.println("예금액: " + account.getBalance());

        //출금
        // - unhandled exception 출력되면 반드시, try ... catch문 또는 main에 throws를 사용해야 함
        // account.withdraw(30000);
        
        // - 1안
//       try {
//            account.withdraw(30000);
//
//        } catch (InsufficientException e) {
//            System.out.println(e.getMessage());
//        }
        
        // - 2안
        account.withdraw(30000);
    }
}
