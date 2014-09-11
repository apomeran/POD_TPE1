package ej3;

public class ProducerThread extends Thread {
	private String name;

	public ProducerThread(String name) {
		this.name = name;
	}

	public void run() {
		while (true) {
			String w = GetRandomString(10);
			WordStack.pushWord(w);
			System.out.println(name + " has produced the string '" + w + "'");
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * Generate a random String with maxlength random characters found in the
	 * ASCII table between 33 and 122 (so it contains every lowercase /
	 * uppercase letters, numbers and some others characters
	 */
	public static String GetRandomString(int maxlength) {
		String result = "";
		int i = 0, n = 0, min = 33, max = 122;
		while (i < maxlength) {
			n = (int) (Math.random() * (max - min) + min);
			if (n >= 33 && n < 123) {
				result += (char) n;
				++i;
			}
		}
		return (result);
	}

}
