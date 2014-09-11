package ej5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ej2.AtomicSyncThread;
import ej2.AtomicSyncThreadBuilder;
import ej2.SynchronizedThread;
import ej2.SynchronizedThreadBuilder;
import ej2.UnsynchronizedThread;
import ej2.UnsynchronizedThreadBuilder;

public class main_ej2 {

	public static void main(String[] args) {
		main_ej_a();
		main_ej_b();
		main_ej_c();
	}
	
	public static void main_ej_a(){
		ExecutorService es = Executors.newCachedThreadPool();


		boolean sleep = false;
		UnsynchronizedThread[] unsyncThread = UnsynchronizedThreadBuilder.UnsyncArray(6, sleep);
		for (UnsynchronizedThread unsync_thread : unsyncThread) {
			es.execute(unsync_thread);
		}
	}
	
	public static void main_ej_b(){
		ExecutorService es = Executors.newCachedThreadPool();

		boolean sleep = false;
		SynchronizedThread[] syncThread = SynchronizedThreadBuilder.syncArray(6, sleep);
		for (SynchronizedThread sync_thread : syncThread) {
			es.execute(sync_thread);		}
	}
	
	public static void main_ej_c(){
		ExecutorService es = Executors.newCachedThreadPool();

		boolean sleep = false;
		AtomicSyncThread[] syncThread = AtomicSyncThreadBuilder.AtomicSyncArray(6, sleep);
		for (AtomicSyncThread atomic_sync : syncThread) {
			es.execute(atomic_sync);		
			}
	}

}
