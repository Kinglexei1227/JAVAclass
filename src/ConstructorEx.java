
//생성자를 사용하는 가장 큰 목적? 생성자는 도대체 어떤 용도로 사용하나??
//=> 멤버변수 초기화!!

class MyCon {
    int age;
    String name;

    public MyCon(int a, String n) { //default 생성자는 아니다
        age = a;
        name = n;
        }
    }



public class ConstructorEx {
    public static void main(String[] args) {
        MyCon m1 = new MyCon(20, "김길동"); //생성자 호출 -> 객체생성
        MyCon m2 = new MyCon(22, "박길동");
        System.out.println(m1.age);
    }
}



