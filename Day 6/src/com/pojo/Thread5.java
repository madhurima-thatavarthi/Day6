package com.pojo;

/**
 * Write a program to create a class Number which implements Runnable. Run
 * method displays the multiples of a number accepted as a parameter. In main
 * create three objects - first object should display the multiples of 2, second
 * should display the multiples of 5 and third should display the multiples of
 * 8. Display appropriate message at the beginning and ending of thread. The
 * main thread should wait for the first object to complete. Display the status
 * of threads before the multiples are displayed and after completing the
 * multiples.
 * 
 * @author Kavya Madhurima
 *
 */


public class Thread5 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<10;i++) {
			System.out.println("5 * "+i+" = "+(5*i));
		}
		 System.out.println("Multiplication 5 is completed");
	}

}
