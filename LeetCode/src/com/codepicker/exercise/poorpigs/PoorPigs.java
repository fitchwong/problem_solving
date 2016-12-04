package com.codepicker.exercise.poorpigs;

public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        if (buckets <= 0) {
            throw new IllegalArgumentException("Buckets cannot smaller than 1");
        }
        if (buckets == 1) {
            return 0;
        }
        if (minutesToDie > minutesToTest) {
            throw new IllegalArgumentException("minutesToTest cannot be smaller than minutesToDie");
        }
        int bucketPerPig = minutesToTest / minutesToDie + 1;
        int numberOfPig = 1;
        int totalBucketCanBeTested = bucketPerPig;

        // It is faster than using Math.pow()
        while (totalBucketCanBeTested < buckets) {
            totalBucketCanBeTested *= bucketPerPig;
            numberOfPig++;
        }
        return numberOfPig;
    }
}
