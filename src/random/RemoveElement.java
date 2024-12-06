package random;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
    }

    static public int removeElement(int[] nums, int val) {
        int notValElements = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[notValElements] = nums[i];
                notValElements++;
            }
        }
        return notValElements;
    }
}
