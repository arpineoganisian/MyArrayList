import java.util.Scanner;

public class Homework01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.next();
        int k = scanner.nextInt();
        System.out.println(numbers.charAt(k - 1));
    }
}
