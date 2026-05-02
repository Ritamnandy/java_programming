//TicTacToe game

import java.util.Scanner;

public class TicTacToe {

    private static void initilizedarray(char[][] arr) {
        char k = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = k;
                k++;
            }
        }
    }

    // private static char checkWinningStatus(char[][] arr) {
    //     char var;
    //     if ((arr[0][0] == 'X') && (arr[0][1] == 'X') && (arr[0][2] == 'X')) {
    //         var = 'X';
    //     } else {
    //         var = 'O';
    //     }
    //     if ((arr[1][0] == 'X') && (arr[1][1] == 'X') && (arr[1][2] == 'X')) {
    //         var = 'X';
    //     } else {
    //         var = 'O';
    //     }
    //     if ((arr[2][0] == 'X') && (arr[2][1] == 'X') && (arr[2][2] == 'X')) {
    //         var = 'X';
    //     } else {
    //         var = 'O';
    //     }
    //     if ((arr[0][0] == 'X') && (arr[1][0] == 'X') && (arr[2][0] == 'X')) {
    //         var = 'X';
    //     } else {
    //         var = 'O';
    //     }
    //     if ((arr[0][0] == 'X') && (arr[1][0] == 'X') && (arr[2][0] == 'X')) {
    //         var = 'X';
    //     } else {
    //         var = 'O';
    //     }
    //     return var;
    // }
    private static void fieldstructure(char[][] arr) {
        System.out.print("-------------------------\n");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.println("    " + arr[0][0] + "    " + "   " + arr[0][1] + "    " + "   " + arr[0][2] + "    ");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.print("-------------------------\n");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.println("    " + arr[1][0] + "    " + "   " + arr[1][1] + "    " + "   " + arr[1][2] + "    ");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.print("-------------------------\n");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.println("    " + arr[2][0] + "    " + "   " + arr[2][1] + "    " + "   " + arr[2][2] + "    ");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.print("-------------------------\n");
    }

    public static void main(String[] args) {
        char[][] arr = new char[3][3];
        char move = 'X';
        boolean isWin = true;
        Scanner scanner = new Scanner(System.in);
        TicTacToe.initilizedarray(arr);

        while (isWin) {
            System.out.println("----- Play Tic Tac Toe -----\n");
            System.out.println("");
            TicTacToe.fieldstructure(arr);
            System.out.print("Enter a slot number to place " + move + " in:- ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            switch (choice) {
                case 1 -> {
                    arr[0][0] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move == 'X') ? 'O' : 'X';
                }

                case 2 -> {
                    arr[0][1] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move == 'X') ? 'O' : 'X';

                }

                case 3 -> {
                    arr[0][2] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move == 'X') ? 'O' : 'X';

                }

                case 4 -> {
                    arr[1][0] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move == 'X') ? 'O' : 'X';

                }

                case 5 -> {
                    arr[1][1] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move == 'X') ? 'O' : 'X';

                }

                case 6 -> {
                    arr[1][2] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move == 'X') ? 'O' : 'X';
                }

                case 7 -> {
                    arr[2][0] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move == 'X') ? 'O' : 'X';
                }

                case 8 -> {
                    arr[2][1] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move == 'X') ? 'O' : 'X';
                }

                case 9 -> {
                    arr[2][2] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move == 'X') ? 'O' : 'X';
                }
                default ->
                    System.out.println("Invalid choice please try again");
            }
        }
    }
}
