package ru.netology;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

         ArrayList <String> buy = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("***********************************");
            System.out.println("1 - Добавить");
            System.out.println("2 - Показать");
            System.out.println("3 - Удалить");
            System.out.println("4 - Поиск");
            System.out.println("`end` (©) - Выход");
            System.out.println("Выберите операцию или введите `end`");

            String inputString = scanner.nextLine();
            if ("end".equals(inputString)) break;
            System.out.println();
            switch (Integer.parseInt(inputString)){
                case 1:
                    System.out.println("Какую покупку хотите добавить?");
                    buy.add(scanner.nextLine());
                    System.out.println("Итого в списке покупок: " + buy.size());
                    break;
                case 2:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < buy.size(); i++) {
                        printItem(i, buy.get(i));
                        //System.out.println((i+1) + ". " + buy.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < buy.size(); i++) {
                        printItem(i, buy.get(i));
                        //System.out.println((i+1) + ". " + buy.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    System.out.println();
                    inputString = scanner.nextLine();
                    try {
                        buy.remove(Integer.parseInt(inputString) - 1);
                    } catch (NumberFormatException e) {
                        buy.remove(inputString);
                    }

                    break;
                case 4:
                    System.out.println("Введите текст для поиска:");
                    inputString = scanner.nextLine();
                    String itemLower;
                    System.out.println("Найдено:");
                    for (int i = 0; i < buy.size(); i++) {
                        itemLower = buy.get(i).toLowerCase();
                        if (itemLower.contains(inputString.toLowerCase())) {
                            printItem(i, buy.get(i));
                            //System.out.println((i+1) + ". " + buy.get(i));
                        }
                    }
                    break;
            }
        }
    }

    public static void printItem(int i, String buyItem){
        System.out.println((i+1) + ". " + buyItem);
    }

}
