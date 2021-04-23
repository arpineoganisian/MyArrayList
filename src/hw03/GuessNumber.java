package hw03;

import java.util.Scanner;

public class GuessNumber {

    // Игра "Угадай число"
    // Компьютер генерирует случайное число в диапазоне от о до 10.
    // Игрок вводит ответ с клавиатуры. Если введеное число больше или меньше загаданного,
    // компьютер дает подсказку. Если число угадано, программа завершится.

    public static void main(String[] args) {

        int randNum = (int)(Math.random() * 11);

        while (true) {

            System.out.println("Please enter a number from 1 to 10:");

            Scanner in = new Scanner(System.in);
            int userAnswer = in.nextInt();

            if (userAnswer == randNum) {
                System.out.println("That's the right answer!");
                return;
            }
            else {
                int diff = Math.abs(userAnswer - randNum);
                switch (diff) {
                    case 1:
                        System.out.println("Sahara Desert!");
                        break;
                    case 2:
                    case 3:
                        System.out.println("You are hot!");
                        break;
                    case 4:
                    case 5:
                    case 6:
                        System.out.println("Getting warmer!");
                        break;
                    case 7:
                    case 8:
                        System.out.println("You are cold!");
                        break;
                    case 9:
                        System.out.println("North Pole!");
                        break;
                    default:
                        System.out.println("Sorry! You didn't enter number from 1 to 10!");
                }
            }
        }
    }
}
