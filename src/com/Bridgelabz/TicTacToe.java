package com.Bridgelabz;

public class TicTacToe {
    public static void board() {
        char[] arr = new char[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = ' ';
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        board();
    }
}

