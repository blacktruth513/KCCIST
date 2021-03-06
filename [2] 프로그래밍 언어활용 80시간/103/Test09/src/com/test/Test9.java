package com.test;

class Database {
	void open() {
		System.out.println("Database Open");
	}
}

class Oracle extends Database {
	void oracleselect() {
		System.out.println("Oracle Select");
	}
}

class MySql extends Database {
	void mysqlSelect() {
		System.out.println("MySql Select");
	}
}

public class Test9 {
	static void dbOpenOracle(Oracle o) {
		o.open();
	}
	
	static void dbOpenMysql(MySql m) {
		m.open();
	}
	
	static void dbopen(Database d) { //Database d = o, Database d = m
		d.open();
	}
	public static void main(String[] args) { 
		Oracle o  = new Oracle();
		MySql m = new MySql();
		dbOpenOracle(o);
		dbOpenMysql(m);
		
//		Oracle o = new Oracle();
//		o.open();
//		o.oracleselect();
//		Database d = o;
//		d.open();
//		Oracle o2 = (Oracle) d;
//		o2.open(); o2.oracleselect();
//		MySql m = new MySql();
//				m.open(); m.mysqlSelect();
//				Database d2 = m;
//				MySql m2 = (MySql)d2;
//				m2.open(); m2.mysqlSelect();
//				
	}
}
