package JAVA����._20200826.TEST05.QUIZE;
/*
 * ������ ���ͳ� �Խ����� �Խñ��� ǥ���ϴ� Ŭ�����̴�. 
 */
public class BBSItem {
	static int seqNo; // �Ϸù�ȣ �ʵ�
	String writer; // �ۼ��� �ʵ�
	String writtenDate; // �ۼ����� �ʵ�
	String title; // �����ʵ�
	String content; // �����ʵ�

	public BBSItem(String writer, String writtenDate, String title, String content) {
		// TODO Auto-generated constructor stub
		seqNo++;
		this.writer = writer;
		this.writtenDate = writtenDate;
		this.title = title;
		this.content = content;
		System.out.println(seqNo);
		
	}

	@Override
	public String toString() {
		return "BBSItem [seqNo=" + seqNo + ", writer=" + writer + ", writtenDate=" + writtenDate + ", title=" + title
				+ ", content=" + content + "]";
	}

}

class SeqNo{
	int num;
	
	public void num() {
		num++;
	}
}
/*
�Ϸù�ȣ�� �ش��ϴ� seqNo �ʵ��� ���� ������ �Ķ���ͷ� �޴� ���� �ƴ϶�, 
���ο� ��ü�� ������ ���� �� �ڵ����� �ٿ����� �Ϸ��� �Ѵ�. 
ó������ �����Ǵ� BBSItem��ü���� 1, 
�ι�°�� �����Ǵ� BBSItem �� ü���� 2, 
�̷� ������ �Ϸù�ȣ�� �ٿ������� �� Ŭ������ �����Ͽ���.
*/
