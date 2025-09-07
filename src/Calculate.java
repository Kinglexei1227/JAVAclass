import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        // Scanner 객체 생성 (System.in은 키보드 입력을 의미)
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 정수를 입력하세요: ");
        int a = sc.nextInt();

        System.out.println("두번째 정수를 입력하세요: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("합: " + sum);
    }
}
