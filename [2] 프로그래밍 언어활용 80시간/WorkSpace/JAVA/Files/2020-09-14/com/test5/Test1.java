package com.test5;
abstract class Database {
	abstract void open();
}
class Oracle extends Database {
	public void open() { System.out.println("Oracle open"); }
}
class MySql extends Database {
	public void open() { System.out.println("MySql open"); }
}
//interface Database { void open(); }
//class Oracle implements Database {
//	public void open() { System.out.println("Oracle open"); }
//}
//class MySql implements Database {
//	public void open() { System.out.println("MySql open"); }
//}
//class Database { void open() { System.out.println("Database open"); }}
//class Oracle extends Database { void open() { System.out.println("Oracle open"); }}
//class MySql extends Database { void open() { System.out.println("MySql open"); }}
public class Test1 {
	public static void main(String[] args) {
//		Database[] dbs = { new Oracle(), new MySql() };
		Database[] dbs = new Database[2];
		dbs[0] = new Oracle();
		dbs[1] = new MySql();
		for(Database d : dbs) {
			d.open();
		}
	}
}
