import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task4 {
    public static void main(String[] args) {
        String text = "apple ap-ple ap_ple ap.ple ap1ple";

        String[] words = text.split(" ");

        String regul = "ap[^ ]le";

        System.out.println("найденные слова:");
        for (String word : words) {
            if (word.matches(regul)) {
                System.out.println(word);
            }
        }
    }
}