package sec02.exam01_nestedclass.object;

public class Main {    //중첩 클래스의 분류 별 객체 생성 방법

	public static void main(String[] args) {
		A a = new A();
		//인스턴스 멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		//정적 멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 3;
		A.C.method2();
	
	
		//A.D d = new A.D();
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();

	}


}
