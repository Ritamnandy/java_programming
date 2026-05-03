//TicTacToe game

import java.util.Scanner;

public class TicTacToe {

    private static void initilizedarray(String[] arr) {
        // int k = 1;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.toString(i + 1);

        }
    }

    private static String checkwinanddraw(String[] arr) {
        String line;
        line = (arr[0] + arr[1] + arr[2]).trim();
        if (line.equals("XXX")) {

            return "X";
        } else if (line.equals("OOO")) {
            return "O";
        }

        line = (arr[3] + arr[4] + arr[5]).trim();
        if (line.equals("XXX")) {

            return "X";
        } else if (line.equals("OOO")) {
            return "O";
        }

        line = (arr[6] + arr[7] + arr[8]).trim();
        if (line.equals("XXX")) {

            return "X";
        } else if (line.equals("OOO")) {
            return "O";
        }

        line = (arr[0] + arr[3] + arr[6]).trim();
        if (line.equals("XXX")) {

            return "X";
        } else if (line.equals("OOO")) {
            return "O";
        }

        line = (arr[1] + arr[4] + arr[7]).trim();
        if (line.equals("XXX")) {

            return "X";
        } else if (line.equals("OOO")) {
            return "O";
        }

        line = (arr[2] + arr[5] + arr[8]).trim();
        if (line.equals("XXX")) {

            return "X";
        } else if (line.equals("OOO")) {
            return "O";
        }

        line = (arr[0] + arr[4] + arr[8]).trim();
        if (line.equals("XXX")) {

            return "X";
        } else if (line.equals("OOO")) {
            return "O";
        }

        line = (arr[2] + arr[4] + arr[6]).trim();
        if (line.equals("XXX")) {

            return "X";
        } else if (line.equals("OOO")) {
            return "O";
        }
        boolean isDraw = false;
        for (int i = 0; i < arr.length; i++) {
            isDraw = arr[i].equals(Integer.toString(i + 1));
            if (isDraw) {
                break;
            }
        }
        if (!isDraw) {
            return "draw";
        }
        return null;
    }

    private static void fieldstructure(String[] arr) {
        System.out.print("-------------------------\n");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.println("    " + arr[0] + "    " + "   " + arr[1] + "    " + "   " + arr[2] + "    ");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.print("-------------------------\n");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.println("    " + arr[3] + "    " + "   " + arr[4] + "    " + "   " + arr[5] + "    ");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.print("-------------------------\n");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.println("    " + arr[6] + "    " + "   " + arr[7] + "    " + "   " + arr[8] + "    ");
        System.out.println("|\t" + "|\t" + "|\t" + "|");
        System.out.print("-------------------------\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[9];
        String move = "X", isWin = null;
        int choice;
        TicTacToe.initilizedarray(arr);

        while (isWin == null) {
            System.out.println("----- Play Tic Tac Toe -----\n");
            System.out.println("");
            TicTacToe.fieldstructure(arr);
            System.out.print("Enter a slot number to place \"" + move + "\" in:- ");
            choice = scanner.nextInt();
            if (choice == 0 || choice >= 10) {
                System.out.println("Invalid choice.... ");
                continue;
            }
            switch (choice) {
                case 1 -> {
                    arr[0] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move.equals("X")) ? "O" : "X";
                }

                case 2 -> {
                    arr[1] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move.equals("X")) ? "O" : "X";

                }

                case 3 -> {
                    arr[2] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move.equals("X")) ? "O" : "X";

                }

                case 4 -> {
                    arr[3] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move.equals("X")) ? "O" : "X";

                }

                case 5 -> {
                    arr[4] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move.equals("X")) ? "O" : "X";

                }

                case 6 -> {
                    arr[5] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move.equals("X")) ? "O" : "X";
                }

                case 7 -> {
                    arr[6] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move.equals("X")) ? "O" : "X";
                }

                case 8 -> {
                    arr[7] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move.equals("X")) ? "O" : "X";
                }

                case 9 -> {
                    arr[8] = move;
                    TicTacToe.fieldstructure(arr);
                    move = (move.equals("X")) ? "O" : "X";
                }
                default ->
                    System.out.println("Invalid choice please try again");
            }
            isWin = TicTacToe.checkwinanddraw(arr);
        }
        if (isWin.trim().equals("draw")) {
            System.out.println("It's a draw! Thanks for playing.....");
        } else {
            System.out.println("Congratulations! " + isWin + "'s have won! Thanks for playing...");
        }
    }
}
