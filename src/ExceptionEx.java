public class ExceptionEx {

    public static void main(String[] args) {
        System.out.println("start");
        int x = 10;
        int y = 0;
        int r = 0;
        try {
            r = x / y;
        }catch (ArithmeticException e ) {
            //예외를 잡아냈을때 대응코드
            System.out.println("산술연산 오류 발생");
        }

        int[] k = new int[3];
        k[0] = 0;
        k[1] = 10;
        k[2] = 100;
        System.out.println(k[2]);


        System.out.println("end");


    }
}
