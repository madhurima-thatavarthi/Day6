package com.main;


import com.pojo.DemoThread2;

/**
 * Rewrite the earlier program so that, now the class DemoThread1 instead of
 * implementing from Runnable interface, will now extend from Thread class.
 * 
 * @author Kavya Madhurima
 *
 */

public class DemoThread2Main {

	public static void main(String[] args) {
		DemoThread2 demoThread1=new DemoThread2();
		DemoThread2 demoThread2=new DemoThread2();
		DemoThread2 demoThread3=new DemoThread2();
		
		demoThread1.start();
		demoThread2.start();
		demoThread3.start();

	}

}
