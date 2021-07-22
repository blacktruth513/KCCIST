class Database{
	public String dbName;
	public void open() { System.out.println(dbName + "를 연결을 오픈합니다.");}
}
public class Test10 {
	public static void databaseOpen(Database db) {
		db.open();
	}
	public static void main(String[] args) {
		Database oracle = new Database();
		oracle.dbName = "Oracle 10g";
		oracle.open();
		Database mysql = new Database();
		mysql.dbName = "MySql 5.7";
		mysql.open();		
		databaseOpen(oracle); // Database db = oracle
		databaseOpen(mysql); // Database db = mysql
	}
}
