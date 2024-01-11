package Homework02;

import java.util.ArrayList;
import java.util.Scanner;

public class Sapper {

    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        String input = sScanner.nextLine();
        String[] numsLine = input.split(" ");

        ArrayList<Integer> nums = new ArrayList<>();
        for (String element : numsLine) {
            nums.add(Integer.parseInt(element));
        }

        sapper(nums);
    }

    public static void sapper(ArrayList<Integer> nums) {

    }
    public static void printAnswer(ArrayList<Integer> nums) {

    }

}
