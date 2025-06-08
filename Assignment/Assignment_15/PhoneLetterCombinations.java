import java.util.*;
public class PhoneLetterCombinations {
    private static final String[] KEYPAD = {
        "",     "",     "abc",  "def", "ghi",
        "jkl",  "mno",  "pqrs", "tuv", "wxyz"
    };
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) return result;
        backtrack("", digits, 0, result);
        return result;
    }
    private void backtrack(String combination, String digits, int index, List<String> result) {
        if (index == digits.length()) {
            result.add(combination);
            return;
        }
        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char c : letters.toCharArray()) {
            backtrack(combination + c, digits, index + 1, result);
        }
    }
    public static void main(String[] args) {
        PhoneLetterCombinations plc = new PhoneLetterCombinations();
        List<String> result = plc.letterCombinations("23");
        System.out.println(result);
    }
}
