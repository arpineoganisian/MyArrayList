import java.util.Scanner;

public class Homework01_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        char symbol = scanner.next().charAt(0);
        double y = scanner.nextDouble();

        double res = 0;

        if (symbol == '+') {
            res = x + y;
        }
        if (symbol == '-') {
            res = x - y;
        }
        if (symbol == '*') {
            res = x * y;
        }
        if (symbol == '/') {
            res = x / y;
        }

        System.out.println(res);
    }
}
