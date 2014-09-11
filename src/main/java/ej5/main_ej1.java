package ej5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ej1.ThreadBuilder;

public class main_ej1 {
	public static void main(String[] args) {
		main_ej_a();
		main_ej_b();
		main_ej_c();
	}

	public static void main_ej_a() {
		ExecutorService es = Executors.newCachedThreadPool();
		boolean sleep = false;
		Thread[] threads = ThreadBuilder.ThreadArray(5, sleep);
		for (Thread thread : threads)
			es.execute(thread);

	}

	public static void main_ej_b() {
		ExecutorService es = Executors.newCachedThreadPool();
		boolean sleep = true;
		Thread[] threads = ThreadBuilder.ThreadArray(5, sleep);
		for (Thread thread : threads)
			es.execute(thread);

	}

	public static void main_ej_c() {
		
        // -------------------------- //
	}
}
