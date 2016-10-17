package proj;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * This class holds the main method for the first question, which takes Roman
 * numerals as an input and outputs the decimal version of it.
 * 
 * @author Nathan Mussie
 * @version 9/21/2016
 */
public class RomanNum {

    /**
     * Main file that takes Roman numerals as an input and returns the decimal
     * Pre-Condition: Input is given as Roman numerals and Output is those
     * numerals as decimals
     * 
     * @param args
     *            file of Roman numerals
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        long totalDec = 0;
        File file = new File(args[0]);
        Scanner scanner = new Scanner(file);
        char[] romanNums = scanner.nextLine().toCharArray();
        int i = romanNums.length - 1;
        while (i != -1) {
            if (romanNums[i] == 'I') {
                totalDec += romToDec(romanNums[i]);
            } 
            else {
                if ((i > 0) && romToDec(romanNums[i - 1]) < romToDec(romanNums[i])) {
                    totalDec += romToDec(romanNums[i]) - romToDec(romanNums[i - 1]);
                    i--;
                } 
                else {
                    totalDec += romToDec(romanNums[i]);
                }
            }
            i--;
        }
        System.out.println(totalDec);
        scanner.close();
    }

    /**
     * Takes a char of a Roman numeral and returns the decimal int
     * 
     * @param c
     *            Roman numeral
     * @return decimal value of Roman numeral
     */
    public static long romToDec(char c) {
        if (c == 'I')
            return 1;
        else if (c == 'V')
            return 5;
        else if (c == 'X')
            return 10;
        else if (c == 'L')
            return 50;
        else if (c == 'C')
            return 100;
        else if (c == 'D')
            return 500;
        else if (c == 'M')
            return 1000;
        else
            return 0;
    }
}