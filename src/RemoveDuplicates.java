import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{1, 1, 2}));
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int uniqueElements = 1;
        int index = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] != nums[i + 1]) {
                nums[index++] = nums[i + 1];
                uniqueElements++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return uniqueElements;
    }
}
