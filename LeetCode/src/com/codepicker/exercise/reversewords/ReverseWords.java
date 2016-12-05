package com.codepicker.exercise.reversewords;

public class ReverseWords {
    public String reverseWordsFast(String s) {
        if (s == null) {
            return null;
        }

        char[] charArray = s.toCharArray();
        int start = 0, end = charArray.length - 1;

        // Trim start of string
        while (start <= end && charArray[start] == ' ') {
            start++;
        }

        // Trim end of string
        while (end >= 0 && charArray[end] == ' ') {
            end--;
        }

        if (start > end) {
            return new String("");
        }

        int wordStart = start;
        while (wordStart <= end) {
            if (charArray[wordStart] != ' ') {
                int wordEnd = wordStart + 1;
                while (wordEnd <= end && charArray[wordEnd] != ' ') {
                    wordEnd++;
                }
                reverseWord(charArray, wordStart, wordEnd - 1);
                wordStart = wordEnd;
            } else {
                // Change continuous space to single space
                if (charArray[wordStart - 1] == ' ') {
                    int shiftPos = wordStart;
                    while (shiftPos < end) {
                        charArray[shiftPos] = charArray[++shiftPos];
                        // charArray[shiftPos] = charArray[shiftPos + 1];
                        // shiftPos++;
                    }
                    end--;
                } else {
                    // Go to next char if only single space found
                    wordStart++;
                }
            }
        }
        reverseWord(charArray, start, end);
        return new String(charArray, start, end - start + 1);
    }

    private void reverseWord(char[] charArray, int start, int end) {
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
    }

    public String reverseWordsSlow(String s) {
        StringBuilder source = new StringBuilder(s);
        StringBuilder result = new StringBuilder();
        int sourceLength = source.length();
        int end = -1;
        for (int i = sourceLength - 1; i >= 0; i--) {
            if (source.charAt(i) != ' ') {
                if (end == -1) {
                    end = i + 1;
                }
                if (i == 0) {
                    result = result.append(source.substring(i, end));
                }
            } else {
                if (end != -1) {
                    result = result.append(source.substring(i + 1, end)).append(" ");
                    end = -1;
                }
            }
        }
        return result.toString().trim();
    }
}
