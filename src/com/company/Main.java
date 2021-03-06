package com.company;

/**
 * Создать класс Score со след. полями:
 * String category
 * Массив double[] statistic, размером 10. Этот массив нужно проинициализировать случайными числами.
 * Для этого используйте нестатический блок инициализации.
 * <p>
 * Создать класс GlobalRating со след. полями:
 * Массив static Score[] data, размером 4.
 * Этот массив нужно проинициализировать с помощью статического блока инициализации.
 * Заполнить нужно созданными Score c категориями: views, actions, sharings, buyings
 * <p>
 * Создать класс Main, в нем создать цикл, который выводит на экран данные из  GlobalRating.
 * Для этого обращайтесь к массиву через  GlobalRating.data;
 * <p>
 * Пример вывода:
 * views: 1.01, 0.66, 1.15, 0.86, 2.01, 1.66, 3.01, 1.06, 1.01, 2.55
 * actions: 2.01, 0.66, 5.15, 4.86, 2.01, 6.66, 10.01, 12.06, 1.01, 2.15
 * sharings: 1.01, 0.66, 1.15, 0.86, 2.01, 1.66, 3.01, 1.06, 1.01, 2.55
 * buyings: 4.01, 1.61, 1.15, 4.86, 2.01, 1.66, 3.01, 1.06, 1.01, 2.55
 */

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < GlobalRating.data.length; i++) {
            //Вариант 1
            // System.out.println(GlobalRating.data[i].category + " " + Arrays.toString(GlobalRating.data[i].statistic));


// Вариант 2
            System.out.print(GlobalRating.data[i].category + ": ");
            for (int j = 0; j < GlobalRating.data[i].statistic.length; j++) {
                System.out.print(GlobalRating.data[i].statistic[j] + ", ");
            }
            System.out.println();
        }
    }
}
