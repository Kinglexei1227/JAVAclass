import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");
        int number =  scanner.nextInt();

        int sum = 0;

        for (int i  = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("1부터" + number +"까지의 합: " + sum);
    }
}
