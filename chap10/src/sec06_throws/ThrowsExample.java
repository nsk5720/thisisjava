package sec06_throws;			//실무에서 사용할 가능성이 높음

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

	public static void findClass() throws ClassNotFoundException{  //throws ClassNotFoundException <- 예외 떠넘기기(위로)
		Class clazz = Class.forName("java.lang.string2");			// throws Class~ 없애면 에러 발생
	}
}



