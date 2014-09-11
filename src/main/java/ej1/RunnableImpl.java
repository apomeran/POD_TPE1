package ej1;

import java.util.Random;

public class RunnableImpl implements Runnable {

	private String name;
	private String msg;
	private int wait_time = 0;
	
	public RunnableImpl(String name, String msg, boolean wait) {
		this.name = name;
		this.msg = msg;
		if (wait){
			this.wait_time = randInt(1000, 3000);
		}
	}
	
	public void run() {
		try {
			if (wait_time != 0)
				System.out.println("Wait " + wait_time + " miliseconds for " + name);
			Thread.sleep(wait_time);
			
			System.out.println(msg + name);
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
