package JAVA����._20200914.TEST11.com.test11;

@SuppressWarnings("serial")
class CheckAgeException extends Exception {
	public CheckAgeException() {
		super("����� ���̴� 20�� �̻��Դϴ�.");
	}
}

public class Test01 {
	
	//����ó���� ȣ���������� �ѱ�
	public static void validate(int age) throws CheckAgeException{
		if (age >20) {
			throw new CheckAgeException();
		}else {
			System.out.println("��������");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			validate(30);
		} catch (CheckAgeException e) {
			// TODO Auto-generated catch block
			System.out.println("���� �߻� : " + e.getMessage());
		}
		
	}

}
