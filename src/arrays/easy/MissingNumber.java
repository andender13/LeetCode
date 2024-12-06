package arrays.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

    public static void main(String[] args) {
        System.err.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}));
    }

    public static int missingNumber(int[] nums) {
//        int expectedSum = IntStream.rangeClosed(0, nums.length).sum();
//        int realSum = Arrays.stream(nums).sum();
        int realSum = 0;
        int expectedSum = 0;
        for (int i = 0; i < nums.length; i++) {
            expectedSum += i;
            realSum += nums[i];
        }
        expectedSum += nums.length;
        return expectedSum - realSum;
    }
}
