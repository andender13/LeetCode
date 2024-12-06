package random;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class RearrangeWordsInASentance {
    public static void main(String[] args) {
        System.out.println(arrangeWords("Keep calm and code on"));
    }

    public static String arrangeWords(String text) {
        List<String> words = Stream.of(text.toLowerCase().split(" ")).sorted(Comparator.comparing(String::length)).toList();
        String result = String.join(" ", words);
        return result.substring(0, 1).toUpperCase() + result.substring(1);
    }
}
