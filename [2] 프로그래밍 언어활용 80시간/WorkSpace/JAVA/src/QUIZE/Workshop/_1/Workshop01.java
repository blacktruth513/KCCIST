package QUIZE.Workshop._1;

import java.util.Scanner;

// ���� 1.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop01 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��" );
        
        int sum = getUserInput();
        int point = 0;
        if (sum >= 12000 && sum < 30000) {
//			point = (float) (sum*0.01);
			point = (int) (sum*0.01);
			System.out.println("����Ʈ ���� : "+point+"��");
		}else if(sum >= 30000){
			point = (int) (sum*0.02);
			System.out.println("����Ʈ ���� : "+point+"��");
			
		}
        
    }//The end of Main method
    
    public static int getUserInput() {
        int sum = 0;
    	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
    	System.out.println("========= �ֹ� =========");
    	System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
    	int value1 = scanner.nextInt();
    	System.out.print( " ī��� �ֹ� ���� : " );
    	int value2 = scanner.nextInt();
    	System.out.print( " ���̱� �ֹ� ���� : " );
    	int value3 = scanner.nextInt();
    	System.out.print( " ũ��ġ�� �ֹ� ���� : " );
    	int value4 = scanner.nextInt();
    	
    	System.out.println("========= �ݾ� =========");
    	System.out.println("�Ƹ޸�ī�� : "+(value1*2000)+"��");
    	System.out.println("�� : "+(value2*3000)+"��");
    	System.out.println("���̱� : "+(value3*1500)+"��");
    	System.out.println("ũ��ġ�� : "+(value4*500)+"��");
    	
    	System.out.println("=======================");
    	sum = (value1*2000)+(value2*3000)+(value3*1500)+(value4*500);
    	System.out.println("�� ���� �ݾ� : "+sum);
    	
    	/*
    	if (sum >= 12000 && sum < 30000) {
//			point = (float) (sum*0.01);
			point = (int) (sum*0.01);
			System.out.println("����Ʈ ���� :"+point);
		}else if(sum >= 30000){
			point = (int) (sum*0.02);
			System.out.println("����Ʈ ���� :"+point);
			
		}*/
    	
    	return sum;
    	
    }//The end of getUserInput
}// The end of class
