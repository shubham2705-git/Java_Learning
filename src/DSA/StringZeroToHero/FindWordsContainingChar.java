package StringZeroToHero;
import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingChar {

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains("" + x)) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] words = {"leet", "good", "bad", "subbhame"};
        char x = 'e';
        List<Integer> indices = findWordsContaining(words, x);
        System.out.println(indices);
    }
}

