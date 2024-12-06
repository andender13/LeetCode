package random;

public class JewelsAndStones {
    public static void main(String[] args) {
        System.err.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.contains(stones.charAt(i) + "")) {
                result++;
            }
        }
        return result;
    }
}
