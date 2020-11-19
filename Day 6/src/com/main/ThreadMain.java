package com.main;

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


import com.pojo.Thread4;
import com.pojo.Thread5;
import com.pojo.Thread6;

public class ThreadMain {

	public static void main(String[] args) {
		Thread4 thread4=new Thread4();
		Thread5 thread5=new Thread5();
		Thread6 thread6=new Thread6();
		
		Thread thread1=new Thread(thread4);
		Thread thread2=new Thread(thread5);
		Thread thread3=new Thread(thread6);
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
