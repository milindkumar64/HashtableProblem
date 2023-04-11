package com.bridgelabz.hashtable;

import java.util.Hashtable;
import java.util.StringTokenizer;

public class MyHashMapTest {

	public static void findFrequency() {
		StringTokenizer st = new StringTokenizer(
				"Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations");
		Hashtable<String, Integer> hashtable = new Hashtable<>();
		String word = null;
		while (st.hasMoreTokens()) {

			word = st.nextToken();
			System.out.println(word);
			Integer value = hashtable.get(word);
			if (value == null)
				value = 1;
			else
				value = value + 1;

			hashtable.put(word, value);
		}
		System.out.println(hashtable);
		System.out.println(hashtable.remove("avoidable") + " avoidable has been removed ");
		System.out.println(hashtable);

	}

	public static void main(String[] args) {

		findFrequency();
	}

}
