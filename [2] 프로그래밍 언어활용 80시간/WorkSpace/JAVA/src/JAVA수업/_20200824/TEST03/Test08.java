package JAVA����._20200824.TEST03;

import java.util.Scanner;

/*
 *	Chapter11
 *	11-1 �޼ҵ忡 ���� ���ؿ� �޼ҵ��� ����
 *	Page : 241
 *
 *	Ŭ������ ������ �޼ҵ带 �Բ� ��� �����Ѵ�.
 */

/*
	������
	�л��� Ư¡
		1. ����
		2. ũ��
		3. ��
	�л��� ����, ����
		1. ¢�´�, �Դ´�, �޸���
 */
@SuppressWarnings("unused")
public class Test08 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.color = "������";
		dog.size = 140;
		dog.species = "";
	}
	
}//end of class








/*
������
�л��� Ư¡
	1. ����
	2. ũ��
	3. ��
�л��� ����, ����
	1. ¢�´�, �Դ´�, �޸���
*/
class Dog {
	//member variables
	public String color;
	public int size;
	public String species;
	
	//member methods
	public void bark() {
		System.out.println("���� ¢�´�.");
	}
	public void eat() {
		System.out.println("�Դ´�.");
	}
	public void run() {
		System.out.println("�޸���");
	}
	public void display() {
		System.out.println(color+", "+size+", "+species);
	}
}