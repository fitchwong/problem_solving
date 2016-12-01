package com.codepicker.exercise.repeateddnasequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.codepicker.lib.Logger;

public class RepeatedDNASequence {
	public List<String> findRepeatedDnaSequencesFast(String s) {
		if (s == null) {
			throw new NullPointerException("DNA sequence cannot be null");
		}

		List<String> result = new ArrayList<>();
		int dnaLength = s.length();
		int[] found = new int[1048576];
		short[] charMap = new short[26]; // 26 English characters
		// charMap['A' - 'A'] = 0;
		// charMap['C' - 'A'] = 1;
		// charMap['G' - 'A'] = 2;
		// charMap['T' - 'A'] = 3;
		charMap[0] = 0; // 'A' - 'A' = 0
		charMap[2] = 1; // 'C' - 'A' = 2
		charMap[6] = 2; // 'G' - 'A' = 6
		charMap[19] = 3; // 'T' - 'A' = 19

		if (dnaLength > 10) {
			int subStringAsInteger = 0;
			for (int i = 0; i < dnaLength; i++) {
				subStringAsInteger <<= 2;
				subStringAsInteger |= charMap[s.charAt(i) - 'A'];
				subStringAsInteger &= 0xfffff;
				if (i < 9) {
					continue;
				}
				if (found[subStringAsInteger] <= 1) {
					if (found[subStringAsInteger]++ == 1) {
						result.add(s.substring(i - 9, i + 1));
					}
				}
			}
		}

		return result;
	}

	public List<String> findRepeatedDnaSequencesSlow(String s) {
		if (s == null) {
			throw new NullPointerException("DNA sequence cannot be null");
		}

		List<String> result = new ArrayList<>();
		int dnaLength = s.length();

		if (dnaLength > 10) {
			HashMap<String, Integer> foundSequence = new HashMap<>();

			int endOfLoop = dnaLength - 10;
			for (int i = 0; i <= endOfLoop; i++) {
				String subSequence = s.substring(i, i + 10);
				if (!foundSequence.containsKey(subSequence)) {
					foundSequence.put(subSequence, 1);
				} else if (foundSequence.get(subSequence) == 1) {
					foundSequence.put(subSequence, 2);
					result.add(subSequence);
				}
			}
		}

		return result;
	}
}
