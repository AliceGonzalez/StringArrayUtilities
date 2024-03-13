package com.zipcodewilmington;

import java.sql.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i].contains(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] newArray = new String[array.length];
        int newIdx = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[newIdx] = array[i];
            newIdx++;
        }
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversedArray = new String[array.length];
        int arrayIndex = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[arrayIndex] = array[i];
            arrayIndex++;
            if (Arrays.equals(array, reversedArray)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder concatenatedStr = new StringBuilder();
        for (String str : array) {
            concatenatedStr.append(str);
        }

        String concatenatedLowerCase = concatenatedStr.toString().toLowerCase();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (char letter : alphabet) {
            if (concatenatedLowerCase.indexOf(letter) == -1) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        //Create new int array
        ArrayList<String> newArray = new ArrayList<>();
        //String[] newArray = new String[Array.length -1];

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                newArray.add(array[i]);
            }
        }
        return newArray.toArray(new String[0]);
    }

    // ArrayList<Type> str = new ArrayList<Type>();

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> newArray = new ArrayList<>();
        if (array.length > 0) {
            newArray.add(array[0]);
        }
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                newArray.add(array[i]);
            }
        }
        return newArray.toArray(new String[0]);
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> strList = new ArrayList<>();

        if (array.length > 0) {
            strList.add(array[0]);
        }

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                String lastStr = strList.get(strList.size() - 1);
                strList.set(strList.size() - 1, lastStr + array[i]);
            } else {
                strList.add(array[i]);
            }
        }
        return strList.toArray(new String[0]);
    }
}

