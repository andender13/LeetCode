import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber
{
    static public List<String> Letter_Combinations_of_a_Phone_Number(String digits)
    {
        List<String> res = new ArrayList<>();

        if (digits == null || digits.isEmpty()) {
            return res;
        }

        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        backtrack(digits, 0, new StringBuilder(), res, digitToLetters);

        return res;
    }

    private static void backtrack(String digits, int idx, StringBuilder comb, List<String> res, Map<Character, String> digitToLetters) {
        if (digits.length()==idx) {
            res.add(comb.toString());
            return;
        }

        String letters = digitToLetters.get(digits.charAt(idx));
        for (char letter : letters.toCharArray()) {
            comb.append(letter);
            backtrack(digits, idx + 1, comb, res, digitToLetters);
            comb.deleteCharAt(comb.length() - 1);
        }
    }
}

