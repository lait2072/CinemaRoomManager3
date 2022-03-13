import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Cinema {

    static int rows;
    static int collums;
    static int seats;
    final static char FREE_SEAT = 'S';
    final static char BOOKED_SEAT= 'B';
    static char[][] map;
    static double counter = 0;
    static int totalCounter = 0;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        rows = console.nextInt();
        System.out.println("Enter the number of seats in each row:");
        collums = console.nextInt();
        seats = rows * collums;
        fillMap();
        speak();
    }


    public static void speak(){
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
        Scanner console = new Scanner(System.in);
        int choose = console.nextInt();
        switch (choose){
            case 1: createMap();
                break;
            case 2: countCost();
                break;
            case 3: statistic();
                break;
            case 0:
                break;
        }
    }

    private static void statistic() {
        System.out.printf("Number of purchased tickets: %.0f\n", counter);
        System.out.printf("Percentage: %.2f%c\n", counter/seats*100, '%');
        System.out.printf("Current income: $%d\n", totalCounter);
        double cash = 0;
        if (seats > 60){
            cash = Math.floor(rows / 2) * collums * 10;
            cash += (rows - Math.floor(rows / 2)) * collums * 8;
        }
        else{
            cash = seats * 10;
        }
        System.out.printf("Total income: $%.0f\n\n", cash);
        speak();
    }

    private static void fillMap() {
        map = new char[rows][collums];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < collums; j++){
                map[i][j] = FREE_SEAT;
            }
        }
    }

    private static void createMap() {
        System.out.print("Cinema:" + "\n ");
        for (int i = 1; i <= collums; i++){
            System.out.print(" " + i);
        }
        System.out.print("\n");
        for (int i = 1; i <= rows; i++){
            System.out.print(i);
            for (int j = 0; j < collums; j++){
                System.out.print(" " + map[i - 1][j]);
            }
            System.out.println();
        }
        System.out.println();
        speak();
    }

    private static void countCost() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int rowsBuy = console.nextInt();
        System.out.println("Enter a seat number in that row:");
        int collumsBuy = console.nextInt();
        if(rowsBuy > rows || rowsBuy < 1 || collumsBuy > collums || collumsBuy < 1){
            System.out.println("Wrong input!");
            countCost();
        }
        else if (map[rowsBuy - 1][collumsBuy - 1] == BOOKED_SEAT){
            System.out.println("That ticket has already been purchased!");
            countCost();
        }
        else{
            map[rowsBuy - 1][collumsBuy - 1] = BOOKED_SEAT;
            int total;
            if (seats <= 60){
                total = 10;
            }
            else{
                if (Math.floor(rows / 2) < rowsBuy){
                    total = 8;
                }
                else{
                    total = 10;
                }
            }
            System.out.println("Ticket price: $" + total + "\n");
            totalCounter += total;
            counter++;
            speak();
        }
    }
}
