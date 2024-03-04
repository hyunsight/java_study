package ch11.sec06;

public class Account {
    private long balance; //잔고

    public Account() {
    }

    public long getBalance() {
        return balance;
    }

    public void deposit(int money) {
        balance += money; //예금
    }

    //출금
    public void withdraw(int money) throws InsufficientException {
        if (balance < money) {
//            System.out.println("잔고 부족");
            //sout 대신 에러로 출력하고 싶은 메시지 작성
            //이후 try...catch를 하거나 또는 에러 클릭 후 'throws InsufficientException'로 처리하도록 해야 함
            throw new InsufficientException("잔고가 부족합니다. " + (money - balance) + "모자람");
        }
        balance -= money;
    }
}
