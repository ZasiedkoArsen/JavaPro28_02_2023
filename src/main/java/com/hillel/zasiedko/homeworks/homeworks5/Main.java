package com.hillel.zasiedko.homeworks.homeworks5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void countOccurrence(List<String> words, String entryWord) {
        int count = 0;
        for (String word : words) {
            if (word.equals(entryWord)) {
                count++;
            }
        }
        System.out.format("The list contains %d instance(s) of the word \"%s\"\n", count, entryWord);
    }

    public static <T> List<T> toList(T[] dataForConversion) {
        List<T> convertedData = new ArrayList<>();
        for (T item : dataForConversion) {
            convertedData.add(item);
        }
        return convertedData;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        return uniqueNumbers;
    }

    public static void calcOccurrence(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String wordFromList = words.get(i);
            int counter = 0;
            for (int j = 0; j < words.size(); j++) {
                if (wordFromList.equals(words.get(j))) {
                    counter++;
                }
            }
            if (!uniqueWords.contains(wordFromList)) {
                uniqueWords.add(wordFromList);
                System.out.format("%s: %d\n", wordFromList, counter);
            }
        }
    }


    public static List<Words> findOccurrence(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        List<Words> wordOccurrences = new ArrayList<>();
        for (int i = 0; i < words.size(); i++) {
            String wordFromList = words.get(i);
            int counter = 0;
            for (int j = 0; j < words.size(); j++) {
                if (wordFromList.equals(words.get(j))) {
                    counter++;
                }
            }
            if (!uniqueWords.contains(wordFromList)) {
                uniqueWords.add(wordFromList);
                wordOccurrences.add(new Words(wordFromList, counter));
            }
        }
        return wordOccurrences;
    }
}
