package com.classpath.misc;

public class FunctionalProgrammingDemo {

	public static void main(String[] args) {
		Runnable target = () -> {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Called from " + Thread.currentThread().getName() + " index >> " + i);
			}
		};
		Thread t1 = new Thread(target);
		t1.start();
		System.out.println("Called inside the main method");
	}

}