package com.pojo;

/**
 * Write a program to create a class DemoThread1 implementing Runnable
 * interface. In the constructor, create a new thread and start the thread. In
 * run() display a message "running child Thread in loop : " display the value
 * of the counter ranging from 1 to 10. Within the loop put the thread to sleep
 * for 2 seconds. In main create 3 objects of the DemoTread1 and execute the
 * program
 * 
 * @author Kavya Madhurima
 *
 */

public class DemoThread1 implements Runnable {
	public DemoThread1() {
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
