package com.workshop1;

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
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int a1 = getUserInput(); 
        System.out.print( " ī��� �ֹ� ���� : " );
        int a2 = getUserInput(); 
        System.out.print( " ���̱� �ֹ� ���� : " );
        int a3 = getUserInput(); 
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int a4 = getUserInput(); 
        
        int b1 = a1 * 2000;
        int b2 = a2 * 3000;
        int b3 = a3 * 1500;
        int b4 = a4 * 500;
        System.out.println("========= �ݾ� ========= ");
        System.out.println("�Ƹ޸�ī�� : " + b1 );
        System.out.println("ī��� : " + b2);
        System.out.println("���̱� : " + b3);
        System.out.println("ũ��ġ�� : " + b4);
        System.out.println("====================== ");
        int sum = b1 + b2 + b3 + b4;
        System.out.println("�� ���� �ݾ� : " + sum);
        if(sum >= 12000 && sum < 30000) {
        	float sum2 = (float)(sum * 0.01);
        	System.out.println("����Ʈ ���� : " + (int)sum2);
        } else if(sum >= 30000) {
        	float sum2 = (float)(sum * 0.02);
        	System.out.println("����Ʈ ���� : " + (int)sum2);
        }
        
        
        
        
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
