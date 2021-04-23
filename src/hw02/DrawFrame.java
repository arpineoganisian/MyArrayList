package hw02;

import java.util.Scanner;

public class DrawFrame {

    // Написать программу, выполнящую рисование рамки вокруг текстовой строки.
    // Программа должна принимать на вход размеры рамки (длина, ширина) и саму строку.
    // Текстовая строка должна быть отцентрована как по горизонтали, так и по вертикали.
    // В случае, если длина строки не позволяет вписать строку в рамку заданного размера,
    // программа должна вместо рамки выводить сообщение "Ошибка".

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int width = in.nextInt();
        String str = in.next();
        int strLen = str.length();
        int widthParity = (width - 2 - strLen) % 2;

        if (width < strLen + 2 || height < 3) {
            System.out.println("Error");
            return;
        }

        for (int i = 0; i < height; i++) {

            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            else if (i == height / 2) {
                System.out.print("*");
                if (widthParity != 0) {
                    System.out.print(" ");
                }
                for (int k = 0; k < (width - 2 - strLen) / 2; k++) {
                    System.out.print(" ");
                }
                System.out.print(str);
                for (int k = 0; k < (width - 2 - strLen) / 2; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

            else {
                System.out.print("*");
                for (int k = 0; k < width - 2; k++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}