package com.test4;

class Database {
	void open() {
		System.out.println("Database open");
	}
}

class Oracle extends Database {
	void open() {
		System.out.println("Oracle open");
	}
}

class MySql extends Database {
	void open() {
		System.out.println("MySql open");
	}
}

public class Test1 {
	static void dbOpen(Database db) {
		db.open();
	}
	public static void main(String[] args) {
		dbOpen(new Oracle());
		dbOpen(new MySql());
//		Database oracle = new Oracle();
//		oracle.open();
//		Database mysql = new MySql();
//		mysql.open();
	}
}
