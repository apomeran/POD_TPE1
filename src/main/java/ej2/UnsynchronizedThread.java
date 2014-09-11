package ej2;

import java.util.Random;


public class UnsynchronizedThread extends Thread {
	private static int counter;
	private String name;
	private int wait_time = 0;

	
	public UnsynchronizedThread(String name, boolean wait){
		this.name = name;
		if (wait){
			this.wait_time = randInt(1000, 3000);
		}
	}
	
	public void run() {
		try {
			if (wait_time != 0)
				System.out.println("Wait " + wait_time + " miliseconds for " + name);
			Thread.sleep(wait_time);
			System.out.println(this.name + " Initial value " + counter);
			for (int i = 0; i < 1000; i++)
				counter++;				
			System.out.println(name + "Final value " + counter);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static int randInt(int min, int max) {

	    // NOTE: Usually this should be a field rather than a method
	    // variable so that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
}
