package random;

public class FindTheKBeautyOfANumber {
    public static void main(String[] args) {
        System.err.println(divisorSubstrings(30003, 3));
    }

    public static int divisorSubstrings(int num, int k) {
        int numberOfDigits = String.valueOf(Math.abs(num)).length();
        int result = 0;
        for (int i = 0; i < numberOfDigits - k + 1; i++) {
            int number = num / (int) Math.pow(10, numberOfDigits - k - i);
            System.out.println(number);
            int withoutFirst = -1;
            if (i != 0) {
                withoutFirst = number % (int) Math.pow(10, k);
                System.err.println(withoutFirst);
                if (withoutFirst != 0 && num % withoutFirst == 0) {
                    result++;
                }
            } else {
                if (num % number == 0) {
                    result++;
                }
            }
        }
        return result;
    }
}
