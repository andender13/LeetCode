package random;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!map.containsKey(String.valueOf(chars))) {
                map.put(String.valueOf(chars), new ArrayList<>() {{
                    add(str);
                }});
            } else {
                map.get(String.valueOf(chars)).add(str);
            }
        }
        return new ArrayList<>(map.values());
    }

}


