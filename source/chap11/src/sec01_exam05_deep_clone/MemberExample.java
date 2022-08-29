package sec01_exam05_deep_clone;

public class MemberExample {

	public static void main(String[] args) {
		Member original = new Member("홍길동", 25, new int[] {90,  90}, new Car("소나타")); 
		
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜져";
		
		System.out.println("[복재 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for(int i = 0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");  /*?를 기준으로 앞이 참이면 바로 뒤"" 거짓이면 :뒤 , 프린트*/
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);
		System.out.println("======================");
		
		System.out.println("[복재 객체의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for(int i = 0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");  /*?를 기준으로 앞이 참이면 바로 뒤"" 거짓이면 :뒤 , 프린트*/
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);

	}

}
