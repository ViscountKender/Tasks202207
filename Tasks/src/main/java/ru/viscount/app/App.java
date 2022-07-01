package ru.viscount.app;

public class App {
    public static void main(String[] args) {
        // task1();
        //task2();
        //task3();
        //task4();
        //task4_1();
        //task5();
        //task5_1();
        //task_6();
        //task_7();
        //task_8();
        //task9();
        //task10();
        //task11();
        //task12();
        //task13();
        //task14(5);





    }
    // Создайте программу, выводящую на экран первые 20 элементов последовательности 1 3 5 7 9 11 13 15 17 ….
    public static void task1() {
        int[] array;
        array = new int[20];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value = value + 2;

            System.out.println(array[i]);

        }
    }
    //Вывести на консоль только четные числа.
    public static void task2(){
        for (int i = 1; i < 20; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }


        }

    }
    //Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128
    public static void task3() {
        int[] array;
        array = new int[20];
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
            value = value * 2;
            System.out.println(array[i]);

        }
    }
    //Вывести на консоль все числа от 0 до 100, не включая 4 и 13. Реализовать программу двумя способами
    public static void task4(){

        int array[] = new int[100];

        for (int i = 0; i <= array.length; i++) {
            array[i] = i;

            if (array[i] != 4 && array[i]!=13) {

                System.out.println(array[i]);

            }
        }

    }
    public static void task4_1(){
        for (int i = 0; i <= 100; i++) {
            if(i != 4 && i != 13){
                System.out.println(i);
            }

        }
    }

    //Написать бесконечный цикл. Прервать его в тот момент, когда была достигнута 10 степень двойки
    // (в цикле необходимо увеличивать переменную в 2 раза на каждой итерации).
    // Попробовать переписать код без использования break.
    public static void task5(){
        int number = 1;
        int count = 0;
        while (count <10){
            number = number * 2;
            count ++;
            System.out.println(number);

        }

    }
    public static void task5_1(){
        int count = 0;
        int number = 1;
        while (true){
            if (count == 10) break;
            number= number * 2;
            count ++;
            System.out.println(number);

        }
    }
    //Вывести на консоль числа 10, 8, 6 … 0
    public static void task_6(){
       int i = 10;
        while (i >=0){
            System.out.println(i);
            i= i -2;
        }

    }
    //Вывести на консоль таблицу 4на5, состоящую из «+». (четыре строки по пять плюсов в каждой).
    public static void task_7(){

        for (int i = 0; i < 4; i++) {
            System.out.print("+ ");
            for (int j = 0; j < 4; j++) {
                System.out.print("+ ");
            }
            System.out.println();

        }
    }
    //Вывести на консоль таблицу умножения.

    public static void task_8(){
        int result = 0;
        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);

                }
            System.out.println();

        }
    }
    // Дана сумма вклада, процент, на который увеличивается вклад каждый год,
    // а также срок вклада (три переменные). Посчитать общую сумму денег,
    // которую получит клиент по истечении всего срока вклада.
    // Например: вклад 100 Р, ставка 7% ->через год будет 107 Р и так далее
    public static void task9(){
                double sum = 100;
        double percent = 0.07;
        int term = 6;
        for (int i = 0; i < term; i++) {
            sum = (sum * percent) + sum;

        }
        System.out.println(sum);

    }
    //Вывести через цикл английский алфавит
    public static void task10(){
        for(char i = 'a';i<='z';i++)
        {
            System.out.println(i);

        }
    }
    //Посчитать сумму чисел от 0 до 100
    public static void task11(){
        int sum = 0;
        int count = 100;
        for (int i = 0; i < count + 1; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
    }
    // Посчитать сумму четных чисел от 0 до 100
    public static void task12(){
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    //Посчитать сумму четных чисел без использования if
    public static void task13(){
        int sum = 0;
        for (int i = 0; i < 100; i = i + 2) {

            sum = sum + i ;
        }
        System.out.println(sum);

    }
    //Написать цикл, вычисляющий факториал числа
    public static void task14(int factorial){

        int result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;

        }
        System.out.println(result);

    }

}
