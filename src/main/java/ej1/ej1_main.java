package ej1;



public class ej1_main {

	public static void main(String[] args) {
		main_ej_a();
		main_ej_b();
		main_ej_c();
	}
	
	public static void main_ej_a(){
		boolean sleep = false;
		Thread[] threads = ThreadBuilder.ThreadArray(6, sleep);
		for (Thread thread : threads) {
			thread.start();
		}
	}
	public static void main_ej_b(){
		boolean sleep = true;
		Thread[] threads = ThreadBuilder.ThreadArray(6, sleep);
		for (Thread thread : threads) {
			thread.start();
		}
	}
	public static void main_ej_c(){
		Thread[] threads = new Thread[6];
		boolean sleep = true;
		RunnableImpl[] runnableImplementations = RunnableImplBuilder.RunnableImplArray(6, sleep);

		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(runnableImplementations[i]);
			threads[i].start();

		}
	}
}
