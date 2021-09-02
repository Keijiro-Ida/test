package test;

public class Main5 {

	 Thread thread1 = new Thread(new Runnable() {
		public void run() {
			try{Thread.sleep(5000);
			System.out.println("thread1");
		} catch (InterruptedException e) {
			System.out.println("thread1割り込まれた！");
		}
		}
	});
	Thread thread2 = new Thread(new Runnable() {
		public void run() {
			try{Thread.sleep(4000);
			System.out.println("thread2");
		} catch (InterruptedException e) {
			System.out.println("thread2割り込まれた！");
		}
		}
	});
	public void interrupt() {
		thread1.interrupt();
	}
	public void interrupt2() {
		thread2.interrupt();
	}
}
