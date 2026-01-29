package general_practice.firstSwap;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class Main {
    public static String[] firstSwap(String[] strings) {
        if (strings == null) return null;

        int inLength = strings.length;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int i = 0; i < inLength; i++) {
            char key = strings[i].charAt(0);

            if (charIndexMap.containsKey(key)) {
                int index = charIndexMap.get(key);

                if (index == -1) { // if the value is -1, it's already been swapped
                    continue;
                }

                String hold = strings[index]; // hold the previously found string
                strings[index] = strings[i];  // set the previously found string to the current one
                strings[i] = hold;            // set the current string to the held one

                charIndexMap.put(key, -1);
            } else {
                charIndexMap.put(key, i);
            }
        }
        return strings;
    }

    public static void main(String[] args) {
        System.out.println("arh");

        String[] test = {"ab", "ac"}; // → ["ac", "ab"]
        System.out.println(Arrays.toString(firstSwap(test)));

        String[] test2 = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"}; // → ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
        System.out.println(Arrays.toString(firstSwap(test2)));

        String[] test3 = {"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"}; // → ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]
        System.out.println(Arrays.toString(firstSwap(test3)));
    }
}