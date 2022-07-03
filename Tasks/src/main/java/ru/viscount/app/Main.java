package ru.viscount.app;

public class Main {
    public static void main(String[] args) {
        Firma[] firma = {new Firma("Horns", 15,500),
                new Firma("Hooves",25,900),
                new Firma("Buy",8,1200),
                new Firma("Sell",8,1600)};
        double sum = 0;
        for (int i = 0; i < firma.length; i++) {
            sum = sum + firma[i].profit;
            i++;

        }
        System.out.println(sum);



    }
}
