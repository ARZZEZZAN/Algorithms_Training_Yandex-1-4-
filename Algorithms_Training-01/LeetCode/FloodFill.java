package LeetCode;

import java.util.Arrays;

public class FloodFill {

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(Arrays.deepToString(floodFill(nums, 1, 1, 2)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }

        fill(image, sr, sc, color, image[sr][sc]);

        return image;
    }

    public static void fill(int[][] image, int sr, int sc, int color, int value) {
        if (sr < 0 || sc < 0 || sr > image.length - 1 || sc > image[sr].length - 1) {
            return;
        }

        if (image[sr][sc] != value) {
            return;
        }

        image[sr][sc] = color;
        fill(image, sr, sc + 1, color, value);
        fill(image, sr, sc - 1, color, value);
        fill(image, sr + 1, sc, color, value);
        fill(image, sr - 1, sc, color, value);
    }
}
