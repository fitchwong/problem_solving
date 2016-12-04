package com.codepicker.exercise.cyclicrotation;

import java.util.Arrays;

public class CyclicRotation {
    public int[] rotate(int[] inputArray, int rotation) {
        int arrayLength = inputArray.length;
        if (arrayLength == 0 || arrayLength == 1) {
            return Arrays.copyOf(inputArray, arrayLength);
        }
        rotation %= arrayLength;

        int[] output = new int[arrayLength];

        for (int copyTo = 0; copyTo < arrayLength; copyTo++) {
            int copyFrom = (copyTo - rotation + arrayLength) % arrayLength;
            output[copyTo] = inputArray[copyFrom];
        }

        return output;
    }
}
