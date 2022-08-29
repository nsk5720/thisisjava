package sec12.exam01_wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128~127 초기값일 경우]");
		Integer obj1 = 300;		//127로 두개다 바꾸면 true나옴			정상
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱후 ==결과: " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));

		System.out.println("=========================================");
		
		System.out.println("[-128~127 초기값일 경우]");
		Integer obj3 = 127;										// 	비정상(이상한 것)
		Integer obj4 = 127;
		System.out.println("==결과: " + (obj3 == obj4));
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}

}
