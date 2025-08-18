package com.jsp.mock.array.multithreading;

class MyThread implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Print {
	public static void main(String[] args) {
		MyThread m = new MyThread();
		Thread t = new Thread(m);
		t.start();
	}
}
