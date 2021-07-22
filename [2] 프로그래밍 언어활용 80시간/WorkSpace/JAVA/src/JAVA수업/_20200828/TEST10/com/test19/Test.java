package JAVA����._20200828.TEST10.com.test19;

interface Database {
	void open();
//	void close();
}

abstract class RDBMS implements Database{
	static {
		System.out.println("TEST");
	}
	public RDBMS() {
		/*
		 * �ν��Ͻ��� �������� �ʾƵ� �����ڴ� ȣ��ȴ�.
		 */
		System.out.println("Default RDBMS Constructor");
		
	}
	//Override�� ��Ÿ���� ����
//	public abstract void open();
	public void open() {
		System.out.println("RDBMS");
	}
	//�߻�Ŭ������ �����ϸ� �ش� Ŭ������ ��ӹ޴� Ŭ�������� Override�� �����ؾ��Ѵ�.
	public abstract void close(); 
}

class Oracle extends RDBMS {

	//������ Override
	@Override
	public void open() {
		System.out.println("Oracle");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Test {
	public static void main(String[] args) {
		Oracle o = new Oracle();
		o.open();
		Database d = new Oracle();
		d.open();
	}
}
