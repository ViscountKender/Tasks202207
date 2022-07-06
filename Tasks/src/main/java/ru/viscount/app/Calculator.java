package ru.viscount.app;

public class Calculator {
    int num;
    int num1;

    public Calculator(int num, int num2) {
        this.num = num;
        this.num1 = num2;
    }
    public int add(){
        int sum;
        sum = num + num1;
        return sum;

    }
    public int sub(){
        int diff;
        diff = num - num1;

        return diff;
    }
    public int mul(){
        int work;
        work = num * num1;

        return work;
    }
//    public int div() {
//        int priv;
//        if (num1 == 0) {
//            System.out.println("NaN");
//        } else {
//            priv = num / num1;
//            return priv;
//        }
//    }

//    public boolean examination(int num1) {
//        if (num1 == 0) {
//            return false;
//        }
//
//    }


    public int factorial(int num1){
        int result = 1;
        for (int i = 0; i < num1; i++) {
            result  = num1 * num1;

        }
        return result;
    }

}
