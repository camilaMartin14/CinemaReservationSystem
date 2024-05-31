package com.mycompany.cinema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        
        final char FREE = 'F';
        
        char [][] seats = new char[10][10];
        fillSeats (seats, FREE);
                
        Scanner sc = new Scanner(System.in);
        boolean executeMenu = true;
        int option;

        while(executeMenu){
            showSeats(seats);
            
            System.out.println("1. Reserve a seat");
            System.out.println("2. I'm done with my reservation");
            
            option = sc.nextInt();
            
            try {
                System.out.println("Write one of the options");
                option = sc.nextInt();
                
                switch (option) {
                    case 1:
                        
                        System.out.println("Choose a ROW from 0 to 9 to reserve");
                        int seatRow = sc.nextInt();
                        
                        System.out.println("Choose a COLUMN from 0 to 9 to reserve");
                        int seatColumn = sc.nextInt();
                        
                        if (withinLimitOfArray(seats.length, seats[0].length, seatRow, seatColumn)) {
                            if (seats[seatRow][seatColumn] == FREE) {
                                seats[seatRow][seatColumn] = 'O';
                                System.out.println("Seat reserved successfully!");
                            } else {
                                System.out.println("Seat already occupied. Please choose another seat.");
                            }
                        }
                            
                        break;

                    case 2:
                        System.out.println("See you at the next reservation! :)");
                        executeMenu = false;
                        break;
                    
                    default:
                        System.out.println("Only option 1 or 2 is allowed");
                }
                
            }catch (InputMismatchException e){
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine();
            }
        }
    }
    
    public static void showSeats(char[][] seats) {
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < seats[0].length; j++) {
                    System.out.print(seats[i][j] + " ");
                }
                System.out.println("");
            }
    }
    
    public static void fillSeats(char[][] seats, char symbol){
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                seats[i][j] = symbol;
            }
        }
    }
    
    public static boolean withinLimitOfArray(int rowLength, int columnLength, int x, int y) {
        return x>= 0 && x< rowLength && y>=0 && y <columnLength;
    }
}
