package JAVA����._20200825.TEST04;

public class Test02 {
	public static void main(String[] args) {
		MyClass2 instanceOfMyclass = new MyClass2();
		instanceOfMyclass.message("�ȳ��ϼ���");
		String message = instanceOfMyclass.message2("�ݰ�����");
		System.out.println(message);
	
	}
}

//���� ��Ű�� ���� ���� Ŭ������ ������ �ߺ������� �߻��ȴ�.
class MyClass2 {
	public void message(String msg) {
		System.out.println(msg);
	}
	public String message2(String msg) {
		return msg;
	}
}