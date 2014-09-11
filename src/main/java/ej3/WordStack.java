package ej3;

import java.util.concurrent.CopyOnWriteArrayList;

public class WordStack {
	private static CopyOnWriteArrayList<String> words = new CopyOnWriteArrayList<String>();

	public static String popWord() {
		if (words.isEmpty())
			return null;
		return words.get(0);			
	}
	
	public static void pushWord(String word) {
		words.add(word);
	}
}
