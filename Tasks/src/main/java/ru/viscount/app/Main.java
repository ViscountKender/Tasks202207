package ru.viscount.app;

public class Main {
    public static void main(String[] args) {
        double sumProfi = 0;
        Firm[] firm = {new Firm("Horns", 15,500),
                new Firm("Hooves",25,900),
                new Firm("Buy",8,1200),
                new Firm("Sell",8,1600)};

        for (Firm value : firm) {

            sumProfi = sumProfi + value.profit;

        }
        System.out.println("Total profit firms: " + sumProfi);

        double sunEmployees = 0;
        for (Firm value : firm) {
            sunEmployees = sunEmployees + value.numberOfEmployees;

        }
        System.out.println("Total number of workers: " + sunEmployees);
        double averageSunEmployees;
        averageSunEmployees = sunEmployees/ firm.length;
        System.out.println("Average number of workers: " + averageSunEmployees);

        Square square = new Square(5);
        Square square1 = new Square(6);
        Square square2 = new Square(1);
        Square square3 = new Square(10);
        Square square4 = new Square(8);
        Square[] squares ={square, square1, square2, square3, square4};


        double squArea ;
        double dioganol ;
        double allSqr = 0;
        double perimeter ;
        // double averagePerimeter = 0;
        for (Square value : squares) {
            allSqr = allSqr + square.squareArea();
        }

        System.out.println("Total area of the squares is: " + allSqr);
        double averageSqr = allSqr / squares.length;
        System.out.println("The average square area is: " + averageSqr);

        for (int i = 0; i < squares.length; i++) {
            perimeter = square.perimeterOfSquare();
            squArea = square.squareArea();
            dioganol = square.diagonal();
            System.out.println("The diagonal is: " + dioganol);
            System.out.println("The area is: " + squArea);
            System.out.println("The perimeter is: " + perimeter);

        }
        int max=0;
        for (int i = 0; i < squares.length; i++) {

            if(max<= squares[i].size){
                max = squares[i].size ;
            }

        }
        System.out.println("The biggest square is: " + max );

        Printer printer = new Printer();
        Document document = new Document("t", "a");
        Document document1 = new Document("q", "w");
        Document document2 = new Document("e", "ew");

        printer.printDocument(document);
        printer.printDocument(document1);
        printer.printDocument(document2);

        Box box = new Box(2,4,6);
        box.volumeBoxes();

        Expander exp = new Expander();
        exp.expander(box);


























    }
}
