
class AAA extends Object{
    public AAA(){
        System.out.println("내가 AAA 생성자");
    }
}
class BBB extends AAA {
    public BBB () {
        System.out.println("내가 BBB 생성자");
    }
}

public class OOpEx2 {
    public static void main(String[] args) {
        new BBB();
    }
}
