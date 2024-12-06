package random;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        System.err.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] finalArray = new int[nums.length];
        int indexX = 0;
        int indexY = nums.length / 2;
        for (int i = 0; i < nums.length; i += 2) {
            finalArray[i] = nums[indexX++];
            finalArray[i + 1] = nums[indexY++];
        }
        return finalArray;
    }
}

