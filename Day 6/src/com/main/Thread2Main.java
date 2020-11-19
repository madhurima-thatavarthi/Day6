package com.main;

/**
 * In the previous program remove the try{}catch(){} block 
 * surrounding the sleep method and try to execute the code. 
 * What is your observation?
 * 
 * @author Kavya Madhurima
 */

import com.pojo.Thread1;

public class Thread2Main {

	public static void main(String[] args) {
		Thread1 thread2 = new Thread1("MyThread");
		System.out.println("Thread 2: " + thread2.getName());
		thread2.start();

		thread2 = null;

	}

}

