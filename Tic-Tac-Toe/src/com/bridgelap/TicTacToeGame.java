package com.bridgelap;

public class TicTacToeGame {

    static char[] board= new char[10];
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

    public static void main(String[] args) {
        createBoard(board);
        showboard(board);
    }
}