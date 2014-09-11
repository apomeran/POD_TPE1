package ej2;

public class SynchronizedThreadBuilder {

	public static SynchronizedThread[] syncArray(int n, boolean wait){
		SynchronizedThread[] sync = new SynchronizedThread[n];
		String name;
		for (int i = 1; i <= n; i++){
			name = "Runnable ID " + (i) + " ";
			sync[i-1] = single_sync(name,  wait);

		}
		return sync;
	}
	public static SynchronizedThread single_sync(final String name,final boolean wait_time)
	{
        return new SynchronizedThread(name, wait_time);		
		
	}
}
