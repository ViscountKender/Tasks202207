package ru.viscount.app;

public class Main {
    public static void main(String[] args) {
        double sumProfi = 0;
        Firma[] firma = {new Firma("Horns", 15,500),
                new Firma("Hooves",25,900),
                new Firma("Buy",8,1200),
                new Firma("Sell",8,1600)};

        for (Firma value : firma) {

            sumProfi = sumProfi + value.profit;

        }
        System.out.println("Общая прибыль всех фирм: " + sumProfi);

        double sunEmployees = 0;
        for (Firma value : firma) {
            sunEmployees = sunEmployees + value.numberOfEmployees;

        }
        System.out.println("Общее количество работников: " + sunEmployees);
        double averageSunEmployees;
        averageSunEmployees = sunEmployees/firma.length;
        System.out.println("Среднее количество работников: " + averageSunEmployees);

        Square square = new Square(5);
        Square square1 = new Square(6);
        Square square2 = new Square(1);
        Square square3 = new Square(10);
        Square square4 = new Square(8);
        Square[] squares ={square, square1, square2, square3, square4};

        int biggestSquare = 0;
        double squArea = 0;
        double dioganol = 0;
        double allSqr = 0;
        double perimeter = 0;
        double averagePerimeter = 0;
        for (Square value : squares) {
            allSqr = allSqr + square.squareArea(value.size);
        }

        System.out.println("общая площадь квадратов равна: " + allSqr);
        double averageSqr = allSqr / squares.length;
        System.out.println("Средняя площадь квадратов равна: " + averageSqr);

        for (int i = 0; i < squares.length; i++) {
            perimeter = square.perimeterOfSquare(squares[i].size);
            squArea = square.squareArea(squares[i].size);
            dioganol = square.diagonal(squares[i].size);
            System.out.println("Диагональ равна: " + dioganol);
            System.out.println("Площадь равна: " + squArea);
            System.out.println("Периметр равен: " + perimeter);

        }
        for (int i = 0; i < squares.length; i++) {
            int max=0;
            if(max<= squares[i].size){
                squares[i].size = max;
            }
            System.out.println("Самый большой квадрат это: " + );

        }





















    }
}
