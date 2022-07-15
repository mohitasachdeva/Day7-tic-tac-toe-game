package com.bridgelap;

import java.util.Scanner;

public class TicTacToeGame {

    static char[] board= new char[10];
    static Scanner src = new Scanner(System.in);
    static char symbol;
    static char computerChoice;
    static char playerChoice;
    static char choice;

    static int position;
    static void createBoard(char[] board){
        for(int i=1; i<board.length; i++){
            board[i]='-';

        }
    }
    static void showboard(char[] board){
        for(int i=1; i<board.length; i++){
            System.out.println(board[i]);
            System.out.println(' ');
            if (i%3==0){
                System.out.println();
            }
        }
    }
    static char playerChoice(){
        System.out.println("Choose a Symbol(x,o)");
        symbol=src.next().charAt(0);
        return symbol;
    }
    static char computerChoice(){
        if(symbol == 'x'){
            return 'o';
        }else
        {
            return 'x';
        }
    }
    static void updateBoard(char board[], int player, int position) {
        if (player == 1) {
            symbol = playerChoice();
        } else {
            symbol = computerChoice();
        }
        switch (position) {
            case 1:
                board[1] = symbol;
                break;
            case 2:
                board[2] = symbol;
                break;
            case 3:
                board[3] = symbol;
                break;
            case 4:
                board[4] = symbol;
                break;
            case 5:
                board[5] = symbol;
                break;
            case 6:
                board[6] = symbol;
                break;
            case 7:
                board[7] = symbol;
                break;
            case 8:
                board[8] = symbol;
                break;
            case 9:
                board[9] = symbol;
                break;
            default:
                break;
        }
    }

    static void playerMove(char[] board) {
        System.out.println("Please make a move in between 1 to 9");
        position = src.nextInt();

        updateBoard(board, 1, position);
        System.out.println("Player moved to position " + position);
    }

    static void computerMove(char[] board) {
        position = (int) ((Math.random() * 10) % 9) + 1;
        updateBoard(board, 2, position);
        System.out.println("Computer moved to position " + position);
    }


    public static void main(String[] args) {
        do {
            createBoard(board);

            playerChoice = playerChoice();
            computerChoice = computerChoice();

            showboard(board);
            playerMove(board);
            showboard(board);
            computerMove(board);
            showboard(board);
            System.out.println("Do you want to Continue(y/n)");
            choice=src.next().charAt(0);
        }while(choice == 'y');
    }
}