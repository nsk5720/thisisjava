package sec03.exam04_outterclass_ref;

import sec03.exam04_outterclass_ref.Outter.Nested;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();                            //6��  OutterŬ���� �ҷ�����
		Outter.Nested nested = outter.new Nested();			 //7�࿡�� Outter.Nested �ҷ�����
		nested.print();											 // print�޼ҵ� ȣ�� ����
	}
}
