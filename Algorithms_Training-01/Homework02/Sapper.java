package Homework02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Sapper {

    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        int row = sScanner.nextInt();
        int column = sScanner.nextInt();
        int mins = sScanner.nextInt();
        HashMap<Integer, Integer> coord = new HashMap<>();
        for (int i = 0; i < mins; i++) {
            coord.put(sScanner.nextInt() - 1, sScanner.nextInt() - 1);
            sScanner.nextLine();
        }

       printBoard(row, column, coord);
    }

    private static void printBoard(int row, int column, HashMap<Integer, Integer> coord) {
        boolean used;
        for (int i = 0; i < row; i++) {
            used = false;
            for (int j = 0; j < column; j++) {
                Object coordinate = coord.get(i);
                if ((coordinate != null && coordinate.equals(j)) && !used) {
                    System.out.print("* ");
                    used = true;
                } else {
                    System.out.print("8 ");
                    logicOfGame();
                }
            }
            System.out.println();
        }

    }

    private static void logicOfGame() {
    }


}
