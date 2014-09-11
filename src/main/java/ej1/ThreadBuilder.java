package ej1;

import java.util.Random;

public class ThreadBuilder {
	
	public static Thread[] ThreadArray(int n, boolean wait){
		
		Thread[] threads = new Thread[n];
		String name;
		String msg;
		int sleep = 0;
		for (int i = 0; i < n; i++){
			if (wait)
				sleep = randInt(1000,3000);
			name = "Thread ID " + (i + 1);
			msg = "hola mundo - ";
			threads[i] = single_thread(name, msg, sleep);

		}
		return threads;
		
	}
	public static Thread single_thread(final String name,final String msg, final int wait_time)
	{
		return new Thread() {
			public void run() {
				try {
					if (wait_time != 0)
						System.out.println("Wait " + wait_time + " miliseconds for " + name);
					sleep(wait_time);
					
					System.out.println(msg + name);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};	
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
