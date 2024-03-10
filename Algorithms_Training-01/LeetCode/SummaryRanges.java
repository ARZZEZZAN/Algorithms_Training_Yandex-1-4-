package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
//    Example 1:
//
//    Input: nums = [0,1,2,4,5,7]
//    Output: ["0->2","4->5","7"]
//    Explanation: The ranges are:
//            [0,2] --> "0->2"
//            [4,5] --> "4->5"
//            [7,7] --> "7"
    public static void main(String[] args) {
        summaryRanges(new int[]{});
    }

    public static List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<>();
        int start = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 < nums[i]) {
                if (i - 1 > start) {
                    result.add(nums[start] + "->" + nums[i - 1]);
                } else {
                    result.add(String.valueOf(nums[start]));
                }
                start = i;
            }

            if (i == nums.length - 1) {
                if (start < i) {
                    result.add(nums[start] + "->" + nums[i]);
                } else {
                    result.add(String.valueOf(nums[i]));
                }
            }
        }

        if (nums.length == 1) {
            result.add(String.valueOf(nums[start]));
        }
        return result;
    }
}
