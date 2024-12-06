package random;

public class CountNumberOfBadPairs {
    public static void main(String[] args) {
        System.err.println(countBadPairs(new int[]{43, 69, 66, 40, 33}));
    }

    public static long countBadPairs(int[] nums) {
        int n = nums.length;
        int totalPairs = n * (n - 1) / 2;
        int goodPairs = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] - nums[i] == j - i) {
                    goodPairs++;
                }
            }
        }

        return totalPairs - goodPairs;
    }
}
