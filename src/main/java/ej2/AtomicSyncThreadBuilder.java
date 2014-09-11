package ej2;

public class AtomicSyncThreadBuilder {
	public static AtomicSyncThread[] AtomicSyncArray(int n, boolean wait){
		AtomicSyncThread[] sync = new AtomicSyncThread[n];
		String name;
		for (int i = 1; i <= n; i++){
			name = "Runnable Atomic Sync ID " + (i) + " ";
			sync[i-1] = single_atomic_sync(name,  wait);

		}
		return sync;
	}
	public static AtomicSyncThread single_atomic_sync(final String name,final boolean wait_time)
	{
        return new AtomicSyncThread(name, wait_time);		
		
	}
}
