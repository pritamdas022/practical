package Multithreading;

class MyThreadclass{
	void print(int num) {
		for (int i = 0; i <=5; i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(i);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Thread1 extends Thread{
	MyThreadclass ws;
	public Thread1(MyThreadclass ws) {
		this.ws=ws;
	}
	public void run () {
		ws.print(5);
	}
}
class Thread2 extends Thread{
	MyThreadclass ws;
	public Thread2(MyThreadclass ws) {
		this.ws=ws;
	}
	public void run() {
		ws.print(500);
	}
}
public class WithoutSynchronization {

	public static void main(String[] args) {
		MyThreadclass m1 = new MyThreadclass();
		Thread1 t1 = new Thread1(m1);
		Thread2 t2 = new Thread2(m1);
		t1.start();
		t2.start();

	}

}
