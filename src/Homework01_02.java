import java.util.Scanner;

public class Homework01_02 {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        String param = in.next();
        String numbArr = in.next();
        int numb = Integer.parseInt(numbArr);
        System.out.println(numb);
    }
}

//    Класс StringTokenizer разбивает строку на токены с указанным разделителем.

//    StringTokenizer tokenizer = new StringTokenizer("Кот Васька", " ");
//while (tokenizer.hasMoreElements()){
//        System.out.println(tokenizer.countTokens() + " words remaining to print");
//        System.out.println(tokenizer.nextToken());





//    public String[] split (String regularExpression) и другие перегруженные версии
//    Разбивает строку на массив из слов. Например, есть строка Васька Рыжик Мурзик Барсик и мы хотим получить массив имён котов:
//
//
//        String catNames = "Васька Рыжик Мурзик Барсик";
//        String aCats[] = catNames.split(" ");  // по пробелу
//        Получим:
//
//        aCats[0] = Васька
//        aCats[1] = Рыжик
//        aCats[2] = Мурзик
//        aCats[3] = Барсик

//12,32,3,50,94,659,84,3