package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.string2");
		} catch(ClassNotFoundException e ) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
