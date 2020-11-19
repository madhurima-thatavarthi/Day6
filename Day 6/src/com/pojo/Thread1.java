package com.pojo;

/**
 * Write a program to assign the current thread to t1. 
 * Change the name of the thread to MyThread. Display the changed name of the thread. 
 * Also it should display the current time. Put the thread to sleep for 10 seconds and display the time again.
 * 
 * @author Kavya Madhurima
 * 
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread1 extends Thread {

	public Thread1(String name) {
		super(name);
	}

	public void run() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		for (int i = 1; i <= 2; i++) {
			try {
				System.out.println(sdf.format(date));
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
