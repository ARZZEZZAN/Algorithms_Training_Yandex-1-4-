package Homework02;

import java.util.ArrayList;
import java.util.Scanner;

public class MoreNeighbours {
    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int count = sScanner.nextInt();
        while (count > 0) {
            nums.add(sScanner.nextInt());
            count--;
        }
        int x = sScanner.nextInt();

        System.out.println(moreNeighbours(nums, x));

    }

    public static int moreNeighbours(ArrayList<Integer> nums) {
       return 0;
    }
}
