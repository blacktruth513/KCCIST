package com.test12;

interface Database {
	void open();
}

class Oracle implements Database {
	public void open() {
		System.out.println("Oracle open");
	}
}

class MySql implements Database {
	public void open() {
		System.out.println("MySql open");
	}
}

public class Test1 {
	static Database CreateDatabase(String dbName) {
		Database db = null;
		switch (dbName) {
		case "Oracle":
			db = new Oracle();
			break;
		case "MySql":
			db = new MySql();
			break;
		}
		return db;
	}

	public static void main(String[] args) {
		Database db = CreateDatabase("Oracle");
		db.open();
		Database db2 = CreateDatabase("MySql");
		db2.open();
	}

}
