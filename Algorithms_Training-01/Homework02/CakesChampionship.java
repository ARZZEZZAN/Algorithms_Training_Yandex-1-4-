package Homework02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CakesChampionship {
    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int count = sScanner.nextInt();

        while(count > 0) {
            nums.add(sScanner.nextInt());
            count--;
        }

        System.out.println(cakesChampionship(nums));

    }

    public static int cakesChampionship(ArrayList<Integer> nums) {
        int first = nums.get(0);
        int winner = 0;
        int result = 0;

        for (int i = 1; i < nums.size() - 1; i++) {
            if (first >= nums.get(i)) {
                if (nums.get(i) % 10 == 5
                        && nums.get(i + 1) < nums.get(i)
                        && (winner < first
                        || (winner == first && result < nums.get(i)))) {
                    result = nums.get(i);
                    winner = first;

                }
            } else {
                first = nums.get(i);
            }
        }

        nums.sort(Collections.reverseOrder());
        return nums.indexOf(result) + 1;
    }
}
//275 5 595 35 25 5 655 305 275 115 55 445 155 145 15 5 175 65 15 335 65 5 15 5 145 25 245 85 35 15 45 85 75 565 35 235 185 175 95 165 75 455 225 205 15 5 125 95 75 65 25 15 5 35 25 15 5 235 145 5 175 95 465 145 105 25 145 35 525 385 235 175 85 15 5 185 5 385 145 125 105 55 125 15 5 625 475 285 245 155 125 974 135 95 15 5 15 75 5 65
//155 75 35 25 195 75 45 15 5 215 85 55 25 5 295 225 205 25 15 5 55 25 15 5 185 85 5 335 175 145 5 305 275 25 35 5 135 95 65 45 15 5 325 45 25 15 5 85 25 155 145 125 95 25 15 5 100 385 265 35 5 35 55 25 5 165 145 85 25 15 5 859 45 35 15 5 25 5 75 5 25 15 5 5 115 65 55 45 15 5 135 105 45 195 105 45 5 45 15 575
