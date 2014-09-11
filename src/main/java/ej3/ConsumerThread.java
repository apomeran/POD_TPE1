package ej3;


public class ConsumerThread extends Thread{
	
	private String name;
	
	public ConsumerThread(String name){
		this.name = name;
	}
	
	public void run() {
		while (true) {
			String word = WordStack.popWord();
			if (word != null) {
				System.out.println(name + " --> Number of vocals: " + numberVowels(word) + " in word " + word);
			}
			try { 
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	
//	public static boolean isVowel(char character)
//	{
//	if(character=='a' || character=='A' || character=='e' || character=='E' || character=='i' || character=='I' || character=='o' || character=='O' || character=='u' || character=='U')
//		return true;
//	else
//		return false;
//	}
	
	public static int numberVowels(String string1)
    {

            int count = 0;
            int vowels = 0;
            int consonants = 0;
            for (int i = 0; i < string1.length(); i++)
            {
                    char ch = string1.charAt(i);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || 
                                    ch == 'o' || ch == 'u')
                    {
                            vowels++;
                    }
                    else
                    { 
                            consonants++;
                    }
            }
			return vowels;
    }
	
	

}
