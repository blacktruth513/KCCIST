package com.test9;
interface Database{ 
	void open();
}
class Oracle implements Database {
	public void open() { System.out.println("Oracle open"); }
}
class MySql implements Database  {
	public void open() { System.out.println("MySql open"); }
}
class MsSql implements Database {
	@Override
	public void open() { System.out.println("MsSql open"); }
}
public class Test1 {
	static void dbOpen(Database db) {
		db.open();
	}
	public static void main(String[] args) {
		//Database db = new Database();
		Database db = new Oracle();
		db.open();
		Database db2 = new MySql();
		db2.open();
		dbOpen(new Oracle());
		dbOpen(new MySql());
		dbOpen(new MsSql());
	}
}
