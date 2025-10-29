

//프로젝트 선정이나
//예외 취급해야되는 특정 상황 / 특정 코드가 생기게 됨
//이런 우리만의 예외상황을 관리하기 위해
//우리만의 커스텀된 예외 클래스를 정의해 줄 수 있다.

//우리만의 예외를 정의해줄 때에는 자바의 룰에따라
//모든 예외처리에 관련된 클래스의 최상위 클래스에 해당하는
//Exception 클래스를 상속 받도록 해야 함!


class MyExceptionEx extends Exception {
    public MyExceptionEx(String message) {
        super(message);
    }
}




public class CustomExceptionEx {
    public static void main(String[] args) {

    }
}
