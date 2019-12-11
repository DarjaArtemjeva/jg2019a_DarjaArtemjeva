package lv.jg.homeWork.UniqueWordVocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    private Set<String> uniqueWords = new HashSet<>();

    public void addWord(String newWord) {
        uniqueWords.add(newWord);
    }

    public void getUniqueWords() {
        System.out.println(uniqueWords.size());
    }

    public void printToConsole() {
        uniqueWords.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {

        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.addWord("dog");
        uniqueWordVocabulary.addWord("map");
        uniqueWordVocabulary.addWord("cat");
        uniqueWordVocabulary.addWord("party");
        uniqueWordVocabulary.getUniqueWords();
        uniqueWordVocabulary.printToConsole();
    }
}
