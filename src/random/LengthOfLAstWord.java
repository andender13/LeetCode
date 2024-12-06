package random;

public class LengthOfLAstWord {

    public static void main(String[] args) {
        System.err.println(lengthOfLastWord("  joyboyhg f g    "));
    }

    public static int lengthOfLastWord(String s) {
        int result = 0;
        boolean isStarted = false;
        var charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] != ' ') {
                isStarted = true;
                result++;
            } else {
                if (isStarted) {
                    return result;
                }
            }
        }
        return result;
    }


}
