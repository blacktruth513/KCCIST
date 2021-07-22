package JAVA����._20200828.TEST10.com.test18;

/*
 * �߻�Ŭ����
 * 	�ν��Ͻ�ȭ �Ұ���
 */
abstract class Database {
	abstract void open();
	void close() {
		System.out.println("Database close");
	}
}

class Oracle extends Database {
	
	//Database Ŭ������ �޼ҵ� ������
	@Override // ���ε�
	void open() {
		System.out.println("Oracle open");
	}
}

class MySql extends Database {
	void open() {
		System.out.println("MySql open");
	}
}

public class Test {
	public static void main(String[] args) {
		Database db = new Oracle();	// Override : ���ε�
		db.open();
		db.close();
		Database db2 = new MySql();	// Override : ���ε�
		db2.open();
		db2.close();
	}
}
