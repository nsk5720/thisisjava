package test09;

public class Child extends Parent{
	private String name;
	
	public Child() {
		//super();			//★1★컴파일 시 자동 생성됨 (슈퍼는 부모 호출) but this()때문에 실행되지 않음
		this("홍길동");		//★2★인자가 하나인 아래 메소드 child(String name)가 실행됨
		System.out.println("Child() call");
	}
	
	public Child(String name) {		//★3★이 생성자(파라메터가 하나인...)super()를 호출 
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
