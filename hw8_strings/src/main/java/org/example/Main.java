package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] src) {
        String text = "Hello world and I!";
        System.out.println("1nd reverse: " + reverse(text));
        System.out.println("2nd reverse: " + reverse2(text, "Hello"));
        System.out.println("3nd reverse: " + reverse3(text, 0, 5));
        reverse3(text, 1, 5);
    }
    public static String reverse(String src) {
        char[] charArray = src.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        System.out.println(charArray);

        return new String(charArray);
    }

    public static String reverse2(String src, String dest) {
        int index = src.indexOf(dest);
        if (index != -1) {
            String prefix = src.substring(0, index);
            String reversedSubstr = reverse(dest);
            String suffix = src.substring(index + dest.length());
            return prefix + reversedSubstr + suffix;
        } else {
            return src;
        }
    }

    public static String reverse3(String src, int firstIndex, int lastIndex) {
        if (firstIndex < 0 || lastIndex >= src.length() || firstIndex > lastIndex) {
            return src;
        }

        String prefix = src.substring(0, firstIndex);
        String reversedSubstr = reverse(src.substring(firstIndex, lastIndex + 1));
        String suffix = src.substring(lastIndex + 1);

        return prefix + reversedSubstr + suffix;
    }
}
