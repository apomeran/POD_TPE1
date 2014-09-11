package ej2;


public class UnsynchronizedThreadBuilder{

	public static UnsynchronizedThread[] UnsyncArray(int n, boolean wait){
		UnsynchronizedThread[] unsync = new UnsynchronizedThread[n];
		String name;
		for (int i = 1; i <= n; i++){
			name = "Runnable ID " + (i) + " ";
			unsync[i-1] = single_unsync(name,  wait);

		}
		return unsync;
	}
	public static UnsynchronizedThread single_unsync(final String name,final boolean wait_time)
	{
        return new UnsynchronizedThread(name, wait_time);		
		
	}
}
