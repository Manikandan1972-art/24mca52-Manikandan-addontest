package addontest;
import java.util.LinkedHashSet;
public class duplicate{
    public static String removeDuplicateCharacters(String str) {
        LinkedHashSet<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (seen.add(ch)) { 
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String input = "programming";
        String output = removeDuplicateCharacters(input);
        System.out.println("Result = " + output);
    }
}
