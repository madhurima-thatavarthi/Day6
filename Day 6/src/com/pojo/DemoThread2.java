package com.pojo;

/**
 * Rewrite the earlier program so that, now the class DemoThread1 instead of
 * implementing from Runnable interface, will now extend from Thread class.
 * 
 * @author Kavya Madhurima
 *
 */

public class DemoThread2 extends Thread {
	public DemoThread2() {
		new Thread();
	}

	@Override
	public void run() {
		System.out.println("Running child Thread in loop :");
		for (int i = 1; i <= 10; i++) {
			try {
				System.out.println(i);
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
