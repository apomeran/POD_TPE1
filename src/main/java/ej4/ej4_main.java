package ej4;

// http://stackoverflow.com/questions/16223504/how-to-create-deadlock-using-these-two-threads-and-objects-of-classes-a-and-b

public class ej4_main {

	
	public static void main(String[] args) {
	    final Object a = new Object();
	    final Object b = new Object();

	    Thread t1 = new Thread() {
	        @Override
	        public void run() {
	        	synchronized (a) {
					System.out.println("TH 1 - LOCK A");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
					System.out.println("TH 1 - TRY TO LOCK LOCK B");
					synchronized (b) {
						System.out.println("TH 1 - LOCK ON A & B ");
					}
				}
	        }
	    };

	    Thread t2 = new Thread() {
	        @Override
	        public void run() {
	        	synchronized (b) {
					System.out.println("TH 2 - LOCK B");
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {
					}
					System.out.println("TH 2 - TRY TO LOCK A");
					synchronized (a) {
						System.out.println("TH 2 - LOCK ON A & B");
					}
				}
	        }
	    };
	    t1.start();
	    t2.start();
	}
}
