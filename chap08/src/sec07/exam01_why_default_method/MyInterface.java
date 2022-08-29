package sec07.exam01_why_default_method;

public interface MyInterface {
	public void method1();
	
	public default void method2() {								//default는 나중에 확장할 때 문제가 없음
		System.out.println("MyInterface-method2 실행");
	}
}
