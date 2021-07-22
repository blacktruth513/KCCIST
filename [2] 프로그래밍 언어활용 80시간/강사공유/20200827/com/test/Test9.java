package com.test;
class Database {  void open() { System.out.println("Database Open"); } } 
class Oracle extends Database { void oracleSelect() { System.out.println("Oracle Select");} }
class MySql extends Database { void mysqlSelect() { System.out.println("MySql Select");} }
public class Test9 {
//	static void dbOpenOracle(Oracle o) {
//		o.open();
//	}
//	static void dbOpenMysql(MySql m) {
//		m.open();
//	}
	static void dbOpen(Database d) {
		d.open();
	}
	public static void main(String[] args) {
		Oracle o = new Oracle();
		MySql m = new MySql();
		dbOpen(new Oracle());
		dbOpen(new MySql());
//		dbOpenOracle(o);
//		dbOpenMysql(m);
//		Oracle o = new Oracle();
//		o.open(); o.oracleSelect();
//		Database d = o;
//		d.open();
//		Oracle o2 = (Oracle)d;
//		o2.open(); o2.oracleSelect();
//		MySql m = new MySql();
//		m.open(); m.mysqlSelect();
//		Database d2 = m;
//		d2.open();
//		MySql m2 = (MySql)d2;
//		m2.open(); m2.mysqlSelect();
		
	}
}
