package com.codepicker.exercise.oddoccurrencesinarray;

public class OddOccurrencesInArray {
    public int oddOccurrencesInArray(int[] inputArray) {
        int result = 0;
        int arrayLength = inputArray.length;
        if (arrayLength > 0) {
            result = inputArray[0];

            for (int i = 1; i < arrayLength; i++) {
                result ^= inputArray[i];
            }
        }
        return result;
    }
}
