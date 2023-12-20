package Homework02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SymmetricSequence {
    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int count = sScanner.nextInt();

        while(count > 0) {
            nums.add(sScanner.nextInt());
            count--;
        }
        symmetricSequence(nums);
    }

    public static void symmetricSequence(ArrayList<Integer> nums) {
        int index = nums.size();
        boolean needToCheck = false;
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if (!Objects.equals(nums.get(i), nums.get(nums.size() - (i + 1))) || needToCheck) {
                result.add(nums.get(i));
                nums.add(index, nums.get(i));
                if(isSymmetric(nums)) {
                    Collections.reverse(result);

                    System.out.println(result.size());
                    System.out.print(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                    return;
                }
                needToCheck = true;
            }
        }

        System.out.println(0);
    }

    private static boolean isSymmetric(ArrayList<Integer> nums) {
        int count = 0;
        while (Objects.equals(nums.get(count), nums.get(nums.size() - (count + 1)))) {
            count++;

            if(count == nums.size()) {
                return true;
            }
        }
        return false;
    }
}
//\\ 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8
