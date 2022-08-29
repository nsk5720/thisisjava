package sec01_exam01_equals;

public class MemberExample {

	public static void main(String[] args) {

		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		if(obj1.equals(obj2)) {									//같은표현 obj1==obj2   15열
			System.out.println("obj1과 obj2는 동등합니다");			/*Member class에서 오버라이드 후 재정의하여서 동등함으로 표시*/
		}	else {
			System.out.println("obj1과 obj2는 동등하지 않습니다");
		}
		
		System.out.println("================");
//		if(obj1==obj2) {										== <-- 메소드가 아니라서 재정의 불가능
//			System.out.println("obj1과 obj2는 동등합니다");
//		}	else {
//			System.out.println("obj1과 obj2는 동등하지 않습니다");
//		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다");
		}	else {
			System.out.println("obj1과 obj3는 동등하지 않습니다");
		}
		
	}
}