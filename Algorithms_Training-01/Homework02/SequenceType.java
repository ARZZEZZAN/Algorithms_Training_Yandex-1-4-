package Homework02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SequenceType {
    private static final int END = -2000000000;
    private static final String CONSTANT = "CONSTANT";
    private static final String ASCENDING = "ASCENDING";
    private static final String WEAKLY_ASCENDING = "WEAKLY ASCENDING";
    private static final String DESCENDING = "DESCENDING";
    private static final String WEAKLY_DESCENDING = "WEAKLY DESCENDING";
    private static final String RANDOM = "RANDOM";

    private static final HashMap<Integer, String> TYPES = new HashMap<>();
    static
    {
        TYPES.put(1, CONSTANT);
        TYPES.put(2, ASCENDING);
        TYPES.put(3, WEAKLY_ASCENDING);
        TYPES.put(4, DESCENDING);
        TYPES.put(5, WEAKLY_DESCENDING);
    }

    public static void main(String[] args) throws Exception {
        Scanner sScanner = new Scanner(System.in);

        ArrayList<Integer> nums = new ArrayList<>();
        int elem = 0;
        while ((elem = Integer.parseInt(sScanner.nextLine())) != END) {
            nums.add(elem);
        }

        System.out.println(sequenceType(nums));

    }

    public static String sequenceType(ArrayList<Integer> nums) {
        int flag = 0;
        int previous = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {

            if(previous == nums.get(i) && flag < 2) {
                flag = 1;
            } else if (nums.get(i) > previous && (flag == 0 || flag == 2)) {
                flag = 2;
            } else if (nums.get(i) >= previous && (flag <= 3 || flag == 1)) {
                flag = 3;
            } else if (nums.get(i) < previous && (flag == 0 || flag == 4)) {
                flag = 4;
            } else if (nums.get(i) <= previous && (flag >= 3 || flag == 1)) {
                flag = 5;
            } else {
                return RANDOM;
            }
            previous = nums.get(i);
        }
        if (flag > 0) {
            return TYPES.get(flag);
        }

        return RANDOM;
    }
}
