package Multithreading;
class main {
	int i;
	boolean value = true;
	synchronized void product(int i) {
		if (value) {
			try {
				//wait();
			} catch (Exception e) {
				System.out.println(e);
			}
			this.i = i;
            value = true;
            System.out.println("Production done: " + i);
            notify();
		}
	}
		synchronized int consume() {
	        if (!value) {
	            try {
	                //wait();
	            } catch (Exception e) {
	                System.out.println(e);
	            }
	            System.out.println("Production consumed: " + i);
	            value = true;
	            notify();
	        }
	        return i;
	}
}
class Producer extends Thread {
    main iThread;

    Producer(main iThread) {
        this.iThread = iThread;
    }

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            iThread.product(j);
        }
    }

}
class Consumer extends Thread {
    main iThread;

    Consumer(main iThread) {
        this.iThread = iThread;
    }

    @Override
    public void run() {
        for (int k = 0; k < 5; k++) {
            iThread.product(k);
        }
    }
}
public class InterThread {

	public static void main(String[] args) {
	    main m1 = new main();
        Producer producer = new Producer(m1);
        Consumer consumer = new Consumer(m1);
        producer.start();
        consumer.start();

	}

}
