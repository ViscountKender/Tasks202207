package ru.viscount.app;

import java.util.Scanner;

public class MyArray {
    int [] arr1;
    public static void main(String[] args) {

        MyArray myArray = new MyArray();

       // myArray.sumArray(myArray.array());
        myArray.averageArray(myArray.array());
        
    }
    public int [] array(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        System.out.println("Введите числа массива: ");
        int [] arr1 = new int[size];
        for (int i = 0; i < size; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("массив: ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr1[i]);
        }
        return arr1;
    }


    public int sumArray(int [] array){
        int sum = 0;
        for (int i = 0; i <array.length ; i++) {
            sum = sum + array[i];


        }

        System.out.println("Сумма массива = " + sum);
        return sum;
    }
    public int averageArray(int [] array){
        int average = sumArray(array())/array.length;
        return average;
    }



}
