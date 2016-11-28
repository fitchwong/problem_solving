package com.codepicker.exercise.binarygap;

import com.codepicker.lib.MathUtil;

public class BinaryGap {
    public int calculateGap(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Number cannot smaller than 0, found " + number);
        }

        // less than 5, binary must less than 3 bits
        // 6 = 110
        // 7 = 111
        // 8 = 1110
        // also return 0
        if (number < 9) {
            // 5 is equal to 101
            if (number == 5) {
                return 1;
            }
            return 0;
        }

        // start checking from 9
        int maxGap = 0;
        int lengthOfNumberInBinary = MathUtil.binlog(number);
        int quotient = number;
        int gap = 0;

        while (quotient > 0) {
            int subtrahend = 1 << lengthOfNumberInBinary;
            if (quotient >= subtrahend) {
                quotient -= subtrahend;
                maxGap = Math.max(maxGap, gap);
                gap = 0;
                if (maxGap - 1 >= lengthOfNumberInBinary) {
                    break;
                }
            } else {
                gap++;
            }
            lengthOfNumberInBinary--;
        }
        return maxGap;
    }
}
