import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordsChecker {

    private Set<String> words;

    public WordsChecker(String text) {
        this.words = new HashSet<>();
        words.addAll(List.of(text.split("\\P{IsAlphabetic}+")));
    }

    public boolean hashWord(String word) {
        if (words.contains(word)) {
            return true;
        }
        return false;
    }
}