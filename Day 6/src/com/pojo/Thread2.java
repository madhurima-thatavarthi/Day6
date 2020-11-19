package com.pojo;

/**
 * In the previous program remove the try{}catch(){} block 
 * surrounding the sleep method and try to execute the code. 
 * What is your observation?
 * 
 * @author Kavya Madhurima
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Thread2 extends Thread {

	public Thread2(String name) {
		super(name);
	}

	public void run() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		for (int i = 1; i <= 2; i++) {

			System.out.println(sdf.format(date));
			Thread.sleep(1000);

		}

	}
}
