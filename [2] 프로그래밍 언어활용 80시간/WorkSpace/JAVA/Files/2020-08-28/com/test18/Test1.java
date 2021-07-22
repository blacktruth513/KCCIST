package com.test18;
abstract class Database{
	abstract void open();
	void close() { System.out.println("Database close"); }
}
class Oracle extends Database{
	void open() { System.out.println("Oracle open"); }
}
class MySql extends Database{
	void open() { System.out.println("MySql open"); }
}
public class Test1 {
	public static void main(String[] args) {
		Database db = new Oracle();
		db.open(); db.close();
		Database db2 = new MySql();
		db2.open(); db2.close();
	}
}
