package JAVA����._20200916.TEST13.com.test11;

interface Drawble {
	void draw();
}

public class Test01 {
	public static void main(String[] args) {
		Drawble d = new Drawble() {

			@Override
			public void draw() {
				System.out.println("Draw");
			}
			
		};//inner class
		
		d.draw();
		/*���� ������ ���ٽ����� ����*/
					//�������� �Ұ�ȣ
		Drawble d2 = () ->{System.out.println("Draw");};
		d.draw();
		
		
		
	}//the end of main Method
}
