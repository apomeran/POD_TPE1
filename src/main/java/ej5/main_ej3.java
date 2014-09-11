package ej5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import ej3.ConsumerThread;
import ej3.ProducerThread;

public class main_ej3 {

	public static void main(String[] args) {
		
		main_ej_a();
		main_ej_b();
	}
	
	public static void main_ej_a(){
		ProducerThread producer = new ProducerThread("Productor 1");
		ConsumerThread consumer = new ConsumerThread("Consumidor 1");
		ExecutorService es = Executors.newCachedThreadPool();
		es.execute(producer);
		es.execute(consumer);
		
	}
	
	public static void main_ej_b(){
		int cantProducer = 10;
		int cantConsumer = 10;
		ExecutorService es = Executors.newCachedThreadPool();
			ProducerThread[] producer_thread_array = new ProducerThread[cantProducer];
			for (int i = 0; i < cantProducer; i++){
				producer_thread_array[i] = new ProducerThread("Productor " + i);
				es.execute(producer_thread_array[i]);
			}
		
			ConsumerThread[] consumer_thread_array = new ConsumerThread[cantConsumer];
			for (int i = 0; i < cantConsumer; i++){
				consumer_thread_array[i] = new ConsumerThread("Consumidor " + i);
				es.execute(consumer_thread_array[i]);

			}
		
	}
}
