package test02.test05;

public class IntegerCompareExample {

	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		System.out.println( obj1 == obj2 );
		System.out.println( obj3 == obj4 );
	}
}

//포장클래스인 Integer클래스는 -128~127의 숫자만 부등호 2개로 내부에 값을 비교할 수 있다. 
//100은 범위안에 포함됨으로 부등호 2개로 비교하여 true가 출력됨
//300은 범위안에 포함되지 않으므로 부등호 2개로 비교할 수 없으며 오버라이딩 된 equals 메소드를 사용하여 비교하여야 함.