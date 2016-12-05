package com.codepicker.exercise.frogjump;

public class FrogJump {
    public int frogJump(int start, int end, int step) {
        int distance = (end - start);
        int jump = 0;
        if (distance > 0 && step > 0) {
            if (distance >= step) {
                jump = distance / step;
                if (distance % jump > 0) {
                    jump++;
                }
            } else {
                jump = 1;
            }
        }
        return jump;
    }
}
