package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть текст: ");
        String inputText = sc.next();

        List<String> words = Arrays.asList(inputText.split("\\s+"));
        List<String> sentences = Arrays.asList(inputText.split("[.!?]"));
        int totalWordCount = words.size();
        int totalSentenceCount = sentences.size();
        Map<String, Long> wordFrequency = words.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<TestItem> testItems = wordFrequency.entrySet().stream()
                .map(entry -> {
                    long count = entry.getValue();
                    double wordPercentage = (double) count / totalWordCount * 100;
                    double sentencePercentage = (double) count / totalSentenceCount * 100;
                    return new TestItem(entry.getKey(), count, wordPercentage, sentencePercentage);
                })
                .sorted((item1, item2) -> Long.compare(item2.getCount(), item1.getCount()))
                .toList();
        System.out.println("Слово\tРейтинг\t Процент від слів\t Процент від речень");
        for (TestItem item : testItems) {
            System.out.println(item.getWord() + "\t" + item.getCount() + "\t" + item.getWordPercentage() + "%\t" + item.getSentencePercentage() + "%");
        }
    }

    static class TestItem {
        private String word;
        private long count;
        private double wordPercentage;
        private double sentencePercentage;

        public TestItem(String word, long count, double wordPercentage, double sentencePercentage) {
            this.word = word;
            this.count = count;
            this.wordPercentage = wordPercentage;
            this.sentencePercentage = sentencePercentage;
        }

        public String getWord() {
            return word;
        }

        public long getCount() {
            return count;
        }

        public double getWordPercentage() {
            return wordPercentage;
        }

        public double getSentencePercentage() {
            return sentencePercentage;
        }
    }
}
