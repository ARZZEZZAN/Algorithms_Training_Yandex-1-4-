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
        int count = 1;

        for (int i = 0; i < nums.size(); i++) {
            if (!Objects.equals(nums.get(i), nums.get(nums.size() - (i + 1)))) {
                while (Objects.equals(nums.get(nums.size() - (i + 1)), nums.get(nums.size() - (i + (count+1))))) {
                    count++;
                }
                ArrayList<Integer> result = new ArrayList<>(nums.subList(0, nums.size() - count));
                Collections.reverse(result);

                System.out.println(result.size());
                System.out.print(result.stream().map(String::valueOf).collect(Collectors.joining(" ")));
                return;
            }
        }

        System.out.println(0);
    }
}
//\\ 1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 2 3 4 5 6 7 8
