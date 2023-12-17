package Homework02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

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
        int result = 0;
        ArrayList<Integer> arrayList = new ArrayList<>() {
            {
                add(nums.get(0));
                add(nums.get(nums.size() - 1));
            }
        };

        for (int i = 1; i < nums.size() - 1; i++) {
            arrayList.add(nums.get(i));
            if (first >= nums.get(i)) {
                if (nums.get(i) % 5 == 0 && nums.get(i + 1) < nums.get(i)) {
                    result = nums.get(i);

                }
            } else {
                first = nums.get(i);
            }
        }

        arrayList.sort(Collections.reverseOrder());
        return arrayList.indexOf(result) + 1;
    }
}