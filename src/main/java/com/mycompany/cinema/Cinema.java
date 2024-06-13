package com.mycompany.cinema;

import java.util.Scanner;

public class Cinema {
    
    public static void main(String[] args) {
        
        char seats[][] = new char[10][10];
        boolean occupied = false;
        Scanner sc = new Scanner(System.in);
        int row = 0, seat = 0;
        String answer;
        String seeSeats;
        
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 10; c++) {
                seats[r][c] = 'F';
            }
            
        }
        
        System.out.println("--------- WELCOME TO THE RESERVATION SYSTEM ---------");
        
        while(occupied!=true){
            System.out.println("Do you want to see the free seats? (Y= Yes, Another= No) ");
            seeSeats = sc.next();
            
            if (seeSeats.equalsIgnoreCase("Y")) {
                showSeats(seats);
            }
            
            boolean seatOk = false;
            while(seatOk !=true){
                System.out.println("Enter row and seat to reserve: \n");
                System.out.println("Row (0 to 9): \n");
                row = sc.nextInt();
                
                System.out.println("Seat (0 to 9): \n");
                seat = sc.nextInt();
                
                if (row<= 9 && row>= 0) {
                    if (seat<=9 && seat >= 0) {
                    seatOk =true;
                    }else{
                        System.out.println("The seat number is not valid.");
                    }
                }else{
                    System.out.println("The row number is not valid.");
                }
            }

            
            if (seats[row][seat]==('F')) {
                seats[row][seat]= 'X';
                System.out.println("The seat was reserved correctly");
                
            }else{
                System.out.println("The seat is occupied, please choose another");
            
            }
            
            System.out.println("You want to finalize the reservation? (Y= Yes, Another= No) ");
            answer = sc.next();
            
            if (answer.equalsIgnoreCase("Y")) {
                occupied= true;
            }
        }
    }
        
    static void showSeats(char seats[][]) {
        for(int r = 0; r < seats.length; r++) {
            System.out.print(r + " ");
            
            for(int c = 0; c < seats[0].length; c++) {
                
                System.out.print("[" + seats[r][c] + "]");
            }
            System.out.println("");
        }
    }
}
