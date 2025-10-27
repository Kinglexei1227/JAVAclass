

class ATM implements Runnable{
    private long depositeMoney = 10000;

    public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (getDepositeMoney() <= 0)
                    break;
                withDraw(1000);
            }
    }

}
public void WithDraw(long howMuch) {
    if (getDepositeMoney() > 0) {
        depositeMoney-=howMuch;
        System.out.print(Thread.currentThread().getName()
        + " , ");
        System.out.println("잔액 : " + getDepositeMoney());
    } else {
        System.out.print(Thread.currentThread().getName()
        + " , ");
        System.out.print("잔액이 부족합니다");
    }
}
public long getDepositeMoney() {
    return depositeMoney;

}




public class SynchEx {

    public static void main(String[] args) {

    }
}
