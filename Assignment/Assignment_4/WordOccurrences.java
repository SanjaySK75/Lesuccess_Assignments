import java.util.Scanner;

public class WordOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String word = sc.nextLine();
        String[] words = sentence.split("\\s+|\\.");
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
