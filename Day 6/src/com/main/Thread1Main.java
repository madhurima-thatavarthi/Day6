package com.main;

/**
 * Write a program to assign the current thread to t1. 
 * Change the name of the thread to MyThread. Display the changed name of the thread. 
 * Also it should display the current time. Put the thread to sleep for 10 seconds and display the time again.
 * 
 * @author Kavya Madhurima
 * 
 */

import com.pojo.Thread1;

public class Thread1Main {
	public static void main(String[] args) {

		Thread1 thread1 = new Thread1("MyThread");
		System.out.println("Thread 1: " + thread1.getName());
		thread1.start();

		thread1 = null;

	}
}
