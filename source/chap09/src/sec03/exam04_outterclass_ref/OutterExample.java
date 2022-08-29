package sec03.exam04_outterclass_ref;

import sec03.exam04_outterclass_ref.Outter.Nested;

public class OutterExample {

	public static void main(String[] args) {
		Outter outter = new Outter();                            //6행  Outter클래스 불러오고
		Outter.Nested nested = outter.new Nested();			 //7행에서 Outter.Nested 불러오고
		nested.print();											 // print메소드 호출 가능
	}
}
