package JAVA����._20200826.TEST08.mypack;

import JAVA����._20200826.TEST08.pack.A;

public class B extends A{
	public static void main(String[] args) {
		
//		A a = new A();
//		a.msgPublic();
		
		B b = new B();
		b.msgProtected(); // ��Ӱ��迡���� ������ ������ ����������
		b.msgPublic();
		
	}
	
	@Override
	protected void msgProtected() {
		// TODO Auto-generated method stub
		super.msgProtected();
		System.out.println("JAVA");
	}
	
	@Override
	public void msgPublic() {
		// TODO Auto-generated method stub
		super.msgPublic();
		System.out.println("JAVA");
	}
}


