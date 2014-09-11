package ej2;



public class ej2_main {
	public static void main(String[] args) {
		
	main_ej_a();
		//main_ej_b();
//		main_ej_c();
	}
	
	public static void main_ej_a(){
		boolean sleep = false;
		UnsynchronizedThread[] unsyncThread = UnsynchronizedThreadBuilder.UnsyncArray(6, sleep);
		for (UnsynchronizedThread unsync_thread : unsyncThread) {
			unsync_thread.start();
		}
	}
	
	public static void main_ej_b(){
		boolean sleep = false;
		SynchronizedThread[] syncThread = SynchronizedThreadBuilder.syncArray(6, sleep);
		for (SynchronizedThread sync_thread : syncThread) {
			sync_thread.start();
		}
	}
	
	public static void main_ej_c(){
		boolean sleep = false;
		AtomicSyncThread[] syncThread = AtomicSyncThreadBuilder.AtomicSyncArray(6, sleep);
		for (AtomicSyncThread atomic_sync : syncThread) {
			atomic_sync.start();
		}
	}

}
