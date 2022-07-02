package ru.viscount.app;

import java.util.Arrays;

public class App2 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task9();


    }
    //Создать матрицу 3 на 4. Заполнить ее последовательностью 1, 2, 3, 4…

    public static void task1() {

        int a = 1;
        int[][] array = new int[3][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = a;
                a++;

            }

        }
        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();

        }


    }

    public static int[][] arrayСreation() {
        int a = 1;
        int[][] array = new int[3][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = a;
                a++;

            }

        }
        return array;
    }

    //Получить и вывести на консоль первый элемент матрицы
    public static void task2() {
        arrayСreation();
        System.out.println(arrayСreation()[0][0]);

    }

    //Получить и вывести на консоль последний элемент матрицы:
    // индекс строки и столбца необходимо получить с помощью .length
    public static void task3() {
        arrayСreation();

        System.out.println(arrayСreation()[arrayСreation().length - 1][arrayСreation().length]);


    }

    // Получить и вывести на консоль первый элемент последней строки.
    public static void task4() {
        arrayСreation();
        System.out.println(arrayСreation()[arrayСreation().length - 1][0]);

    }

    //Получить предпоследний элемент первой строки в матрице
    public static void task5() {
        arrayСreation();
        System.out.println(arrayСreation()[arrayСreation().length - 1][arrayСreation().length - 1]);

    }

    //На основании найденной закономерности попробовать решить
    // 8 задачу с помощью цикла (перебрать столбец матрицы с помощью цикла).
    public static void task9() {
        int[][] array = new int[3][4];
        int a = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = a;
                a++;
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0]);
        }
    }


}