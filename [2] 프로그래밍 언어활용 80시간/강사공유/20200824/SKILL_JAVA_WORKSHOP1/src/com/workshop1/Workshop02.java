package com.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// ���� 2.
// A������ �б⸻�� �Ǿ���. �����񺰷� ������ �Է� �޾� ���б��� ���� �л��� �����Ϸ��� �Ѵ�.
// ���б��� ���� �� �ִ� ������ �Ʒ��� ����.
//   1) ������ 3.7 �̻�   2) �� ���� ������ 2.5 �̻� (�� �����̶� 2.5 �̸��� ������ �ִٸ�, �������� ���б� Ż��)
public class Workshop02 {
    
    public static void main( String[] args ) {
        
        System.out.print( "Computer Science ������ �Է��ϼ��� : " );
        double a1 = getUserInput();
        System.out.print( "Java Programming ������ �Է��ϼ��� : " );
        double a2= getUserInput();
        System.out.print( "���м��� ������ �Է��ϼ��� : " );
        double a3 = getUserInput();
        System.out.print( "������� ���� ������ �Է��ϼ��� : " );
        double a4 = getUserInput();
        System.out.print( "������ ������ �Է��ϼ��� : " );
        double a5 = getUserInput();
        System.out.println( "==============================" );
        double avg = (a1 + a2 + a3 + a4 + a5) / 5;
        System.out.println( "������ " + avg + "�� �Դϴ�." );
        
        boolean check1 = (a1 < 2.5)? false:true;
        boolean check2 = (a2 < 2.5)? false:true;
        boolean check3 = (a3 < 2.5)? false:true;
        boolean check4 = (a4 < 2.5)? false:true;
        boolean check5 = (a5 < 2.5)? false:true;
        if(check1 && check2 & check3 && check4 && check5) {
        	System.out.println("���� �б� ���б� ����� �Դϴ�.");
        }
    }
    
    public static double getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	double value = scanner.nextDouble();
    	return value;
    }
}
