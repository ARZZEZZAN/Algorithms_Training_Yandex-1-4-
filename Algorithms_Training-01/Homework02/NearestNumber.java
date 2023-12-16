package Homework02;

import java.util.ArrayList;
import java.util.Scanner;

public class NearestNumber {

    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int count = sScanner.nextInt();
        while (count > 0) {
            nums.add(sScanner.nextInt());
            count--;
        }
        int x = sScanner.nextInt();

        System.out.println(nearestNumber(nums, x));

    }

    public static int nearestNumber(ArrayList<Integer> nums, int x) {
        int res = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if(Math.abs(nums.get(i) - x) < Math.abs(res - x)) {
                res = nums.get(i);
            }
        }
        return res;
    }
}
