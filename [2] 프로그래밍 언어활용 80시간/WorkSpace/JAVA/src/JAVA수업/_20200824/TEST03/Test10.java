package JAVA����._20200824.TEST03;

import java.util.Scanner;

/*
 *	Chapter 07
 *	07-1 Ŭ������ ���ǿ� �ν��Ͻ��� ����
 *	Page : 165
 *
 *	Ŭ������ ������ �޼ҵ带 �Բ� ��� �����Ѵ�.
 */

@SuppressWarnings("unused")
public class Test10 {
	public static void databaseOpen(DataBase db) {
		db.open();
	}
	public static void main(String[] args) {
		
		DataBase oracle = new DataBase();
		oracle.dbName = "Oracle 10g";
		DataBase mysql = new DataBase();
		mysql.dbName = "Mysql 5.7";
		mysql.open();
		databaseOpen(oracle);	//Database db = oracle
		databaseOpen(mysql);	//Database db = mysql
	}//end of method
	
}//end of class