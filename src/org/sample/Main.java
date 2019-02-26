package org.sample;

public class Main extends OverRiding {
	public void child() {
		System.out.println("core java");
    
	}
	public static void main(String[] args) {
		Main dt= new Main();
		dt.baseClass1();
		dt.baseClass();
		dt.child();
		dt.name();
		dt.id();
	}

}
