package com.codepicker.exercise.reversewords;

import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsTest {

    @Test
    public void testSpaceOnly() {
        Assert.assertEquals("", new ReverseWords().reverseWordsFast(" "));
    }

    @Test
    public void testStartWithSpace() {
        Assert.assertEquals("man a am I", new ReverseWords().reverseWordsFast(" I am a man"));
    }

    @Test
    public void testEndWithSpace() {
        Assert.assertEquals("man a am I", new ReverseWords().reverseWordsFast("I am a man "));
    }

    @Test
    public void testBoundWithSpace() {
        Assert.assertEquals("man a am I", new ReverseWords().reverseWordsFast(" I am a man "));
    }

    @Test
    public void testWithMultipleSpace() {
        Assert.assertEquals("man a am I", new ReverseWords().reverseWordsFast("  I  am  a  man   "));
    }

    @Test
    public void testWithShiftA() {
        Assert.assertArrayEquals(new char[] { 'b', 'c', 'd', 'd' }, shiftMethodA(new char[] { 'c', 'b', 'c', 'd' }));
    }

    @Test
    public void testWithShiftB() {
        Assert.assertArrayEquals(new char[] { 'b', 'c', 'd', 'd' }, shiftMethodB(new char[] { 'c', 'b', 'c', 'd' }));
    }

    private char[] shiftMethodA(char[] input) {
        int pos = 0;
        int end = input.length;
        while (pos < end - 1) {
            input[pos] = input[pos + 1];
            pos++;
        }
        return input;
    }

    private char[] shiftMethodB(char[] input) {
        int pos = 0;
        int end = input.length;
        while (pos < end - 1) {
            input[pos] = input[++pos];
        }
        return input;
    }
}
