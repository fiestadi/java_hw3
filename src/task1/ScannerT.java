package task1;

import sun.lwawt.macosx.CPrinterDevice;

import java.util.Scanner;

public class ScannerT {
    private static void printWords(String word1, String word2) {
        int lengh1 = word1.length();
        int lengh2 = word2.length();
        int half1 = lengh1/2;
        int half2 = lengh2/2;
        String ferst = word1.substring(0,half1);
        String second = word2.substring(half2);
        System.out.println(ferst + second);
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово");
        String word1 = scanner.nextLine();
        System.out.println("Введите второе слово");
        String word2 = scanner.nextLine();
        printWords (word1, word2);
    }

    }

