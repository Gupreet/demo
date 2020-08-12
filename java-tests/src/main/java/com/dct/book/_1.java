package com.dct.book;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _1 {

	public static void main(String[] args) {

		String s1 = "asaasasa";
		s1 = s1.replaceAll("\\s", "").toUpperCase();
		int len = s1.length();
		while (len > 0) {
			int count = 1;
			for (int j = 1; j < len; j++) {
				if (s1.charAt(0) == s1.charAt(j)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(s1.charAt(0) + " : " + count);
			}

			String character = String.valueOf(s1.charAt(0)).trim();
			s1 = s1.replaceAll(character, "");
			len -= count;

		}

	}
}