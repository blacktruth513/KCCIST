package JAVA����._20200916.TEST13.com.test09;

/*
 * �Ű������� �������� ����
 */

public class Test01 {
	
	
	static void display(String...vars) {
		for(String s : vars) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display("ȫ�浿");
		display("ȫ�浿","�̼���");
		display("ȫ�浿","�̼���","�念��");
	}

}
