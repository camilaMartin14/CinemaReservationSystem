package com.mycompany.cinema;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cinema {
    
    public static void main(String[] args) {
        
        char seats[][] = new char[10][10];
        boolean occupied = false;
        Scanner sc = new Scanner(System.in);
        int row, seat = 0;
        String answer;
        
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                seats[r][c] = 'F';
            }
            
        }
        
        System.out.println("--------- WELCOME TO THE RESERVATION SYSTEM ---------");
        
        while(occupied!=true){
            System.out.println("Enter row and seat to reserve: \n");
            System.out.println("Row (0 to 9): \n");
            row = sc.nextInt();
            
            if (seats[row][seat]==('F')) {
                seats[row][seat]= 'X';
                System.out.println("The seat was reserved correctly");
                
                
            }else{
                System.out.println("The seat is occupied, please choose another");
            
            
            }
            
            System.out.println("You want to finalize the reservation? (Y= Yes, Another= No) ");
            answer = sc.next();
            
            if (answer.equalsIgnoreCase("S")) {
                occupied= true;
        }
        /*final char FREE = 'F';
        
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
    */
        }
    }
}
