package JAVA����._20200821.TEST02.Workshop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 2.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
@SuppressWarnings("unused")
public class Workshop02 {
    
    public static void main( String[] args ) {
        
    	System.out.println( "==============================" );
     
    	double score = 0;
    	double avg = 0;
    	
       	@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

       	System.out.print( "Computer Science ������ �Է��ϼ��� : " );
    	double value1 = scanner.nextDouble();
    	
    	System.out.print( "Java Programming ������ �Է��ϼ��� : " );
    	double value2 = scanner.nextDouble();
    	
    	System.out.print( "���м��� ������ �Է��ϼ��� : " );
    	double value3 = scanner.nextDouble();
    	
    	System.out.print( "������� ���� ������ �Է��ϼ��� : " );
    	double value4 = scanner.nextDouble();
    	
    	System.out.print( "������ ������ �Է��ϼ��� : " );
    	double value5 = scanner.nextDouble();
    	
    	avg = getUserInput(value1,  value2, value3, value4, value5)/5;
    	System.out.println("������ "+avg+"�� �Դϴ�.");
    	
    	if (avg>=3.7) {
    		if (!(value1 < 2.5 || value2 < 2.5 || value3 < 2.5 || value4 < 2.5 || value5 < 2.5)) {
    			System.out.println("���� �б� ���б� ����� �Դϴ�.");
    		}
		}//The end of if
    	
    	if (avg>=3.7) {
    		if (value1 >= 2.5 && value2 >= 2.5 && value3 >= 2.5 && value4 >= 2.5 && value5 >= 2.5) {
    			System.out.println("���� �б� ���б� ����� �Դϴ�.");
    		}
    	}//The end of if
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static double getUserInput(double value1, double value2, double value3, double value4, double value5) {
    	double score = 0;
        /*
    	
       	Scanner scanner = new Scanner(System.in);
       	System.out.print( "Computer Science ������ �Է��ϼ��� : " );
       	
    	double value1 = scanner.nextDouble();
    	
    	System.out.print( "Java Programming ������ �Է��ϼ��� : " );
    	double value2 = scanner.nextDouble();
    	
    	System.out.print( "���м��� ������ �Է��ϼ��� : " );
    	double value3 = scanner.nextDouble();
    	
    	System.out.print( "������� ���� ������ �Է��ϼ��� : " );
    	double value4 = scanner.nextDouble();
    	
    	System.out.print( "������ ������ �Է��ϼ��� : " );
    	double value5 = scanner.nextDouble();
        */
    	
    	System.out.println( "==============================" );
    	score = value1+value2+value3+value4+value5;
    	/*
    	avg = score/5;
    	
    	System.out.println("������ "+avg+"�� �Դϴ�.");
    	if (avg>=3.7) {
    		if (!(value1 < 2.5 || value2 < 2.5 || value3 < 2.5 || value4 < 2.5 || value5 < 2.5)) {
    			System.out.println("���� �б� ���б� ����� �Դϴ�.");
    		}
		}//The end of if
    	*/
    	return score;
    	
    }// The end of getUserInput()
}//The end of class
