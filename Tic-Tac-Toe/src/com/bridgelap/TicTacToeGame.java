package com.bridgelap;

import java.util.Scanner;

public class TicTacToeGame {

    static char[] board= new char[10];
    static Scanner src = new Scanner(System.in);
    static char symbol;
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

    public static void main(String[] args) {
        System.out.println(" welcome to the tic tac toe game");
        createBoard(board);
        showboard(board);
        System.out.println("Player Choice is "+playerChoice());
        System.out.println("Computer Choice is "+computerChoice());
    }
}