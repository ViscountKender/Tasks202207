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




    }
}
