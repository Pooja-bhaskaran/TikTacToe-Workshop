package com.Bridgelabz;

import java.util.Scanner;

public class TicTacToe {
    static char PLAYER;
    static char COMPUTER;

    public static void board() {
        char[] arr = new char[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = ' ';
            System.out.println("i# : " + arr[i]);
        }
    }

    static void game() {
        Scanner choose = new Scanner(System.in);
        System.out.print(" Enter your choice between 'O' and 'X' : ");
        char ch = choose.next().charAt(0);
        if (ch == 'O') {
            COMPUTER = 'O';
            System.out.println("Player mark as : " + ch);
        } else
            PLAYER = 'X';
        System.out.println("Player mark as : " + ch);

    }

    public static void main(String[] args) {
        game();
        board();
    }
}

