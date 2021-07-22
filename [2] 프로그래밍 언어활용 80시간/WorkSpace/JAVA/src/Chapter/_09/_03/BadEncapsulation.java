package Chapter._09._03;

public class BadEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		
		suf.takeSinivelCap(new SinivelCap());
		suf.takeSneezeCap(new SneezeCap());
		suf.takeSnuffleCap(new SnuffleCap());
		
	}
}

//�๰ óġ�� ĸ��
class SinivelCap extends Cap{
	@Override
	void take() {
		System.out.println("�๰�� ��~ ���ϴ�.");
	}
}

//��ä�� óġ�� ĸ��
class SneezeCap extends Cap{
	@Override
	void take() {
		System.out.println("��ä�Ⱑ �ܽ��ϴ�.");
	}
}

//�ڸ��� óġ�� ĸ��
class SnuffleCap extends Cap{
	@Override
	void take () {
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}
}

//ColdPatient : ����ȯ��
class ColdPatient{
	void takeSinivelCap(SinivelCap cap) {
		cap.take();
	}
	void takeSneezeCap(SneezeCap cap) {
		cap.take();
	}
	void takeSnuffleCap(SnuffleCap cap) {
		cap.take();
	}
}