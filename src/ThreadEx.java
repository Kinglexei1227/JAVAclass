
//자바에서 Thread 사용을 위한 문법 2가지
//(1)번 방식으로 정의
class MyThread1 extends Thread {
    public void run() {
        //Thread가 수행할 작업을 코딩
        for (int i=0; i<10; i++){
            System.out.println(i);
        }
    }
}
public class ThreadEx {

    public static void main(String[] args) {
        System.out.println("Start");

        //(1) 방식 사용
        MyThread1 m1 = new MyThread1();
        m1.start(); //Thread 실행을 위해서는 꼭!start()메소드 호출할것!
//      m1.run(); //잘못된 코드

        System.out.println("End");
    }
}
