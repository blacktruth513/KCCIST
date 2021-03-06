package com.test19;

interface Database {
	void open();
}

abstract class RDBMS implements Database {
	RDBMS() {
		System.out.println("Default RDBMS Constructor");
	}

	public void open() {
		System.out.println("RDBMS");
	}

	public abstract void close();
}

class Oracle extends RDBMS {
	public void close() {System.out.println("Oracle close");}
}

public class Test1 {
	public static void main(String[] args) {
		Oracle o = new Oracle();
		o.open();
		Database d = new Oracle();
	}
}
