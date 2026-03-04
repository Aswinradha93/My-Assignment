package week5.day2;

import java.util.HashSet;
import java.util.Set;

public class Jewel {
	public static void main(String[] args) {
		String jewels = "z";
		String stones = "ZZ";
		int output = 0;

		Set<Character> jewel = new HashSet<>();
		for (int i = 0; i < jewels.length(); i++)
			jewel.add(jewels.charAt(i));

		for (int i = 0; i < stones.length(); i++) {
			char stone = stones.charAt(i);
			if (jewel.contains(stone))
				output++;

		}
		System.out.println(output);
		int count = 0;
		for (char c : stones.toCharArray()) {
		    if (jewels.indexOf(c) != -1) {
		        count++;
		    }
		}
		System.out.println(count);
	}

}