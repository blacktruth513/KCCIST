package com.test;

class SinusCap {
	void sniTake() {
		System.out.println("�๰�� ��~ ���ϴ�.");
	}

	void sneTake() {
		System.out.println("��ä�Ⱑ �ܽ��ϴ�.");
	}

	void sunTake() {
		System.out.println("�ڰ� �� �ո��ϴ�.");
	}

	void tak3() { // ���� ���� ��� �� ������ ��� �޼ҵ�
		sniTake();
		sneTake();
		snuTake();
	}
}

class ColdPatient {
	void takeSinus(SinusCap cap) {
		cap.Take();
	}
}

public class OneClassEncapsulation {
	public static void main(String[] args) {
		ColdPatient suf = new ColdPatient();
		suf.takeSinus(new SinusCap());

	}

}
