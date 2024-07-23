import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{8, 9, 9, 9})));
    }

    public int[] plusOne(int[] digits) {
        if (digits.length == 0) return digits;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 10) {
                digits[i]++;
            }
            if (digits[i] == 10) {
                digits[i] = 0;
                if (i > 0) {
                    digits[i - 1]++;
                    if (digits[i - 1] != 10) {
                        return digits;
                    }
                } else {
                    int[] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    return newDigits;
                }
            } else {
                return digits;
            }
        }
        return digits;
    }
}
