package ej3;



public class ej3_main {

	public static void main(String[] args) {
		
	//	main_ej_a();
		main_ej_b();
	}
	
	public static void main_ej_a(){
		ProducerThread producer = new ProducerThread("Productor n|1");
		ConsumerThread consumer = new ConsumerThread("Consumidor n|1");
		producer.start();
		consumer.start();
		
	}
	
	public static void main_ej_b(){
		int cantProducer = 3;
		int cantConsumer = 80;
			ProducerThread[] producer_thread_array = new ProducerThread[cantProducer];
			for (int i = 1; i < cantProducer; i++){
				producer_thread_array[i-1] = new ProducerThread("Productor n|" + i);
				producer_thread_array[i-1].start();
			}
		
			ConsumerThread[] consumer_thread_array = new ConsumerThread[cantConsumer];
			for (int i = 1; i < cantConsumer; i++){
				consumer_thread_array[i-1] = new ConsumerThread("Consumidor n|" + i);
				consumer_thread_array[i-1].start();
			}
		
	}
}

