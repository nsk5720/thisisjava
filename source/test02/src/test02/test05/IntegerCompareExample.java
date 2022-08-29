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


// 포장클래스 Integer클래스는 -128~127사이의 숫자는 등호 2개로 내부에 값을 비교할 수 있다
// 따라서 100은 범위안에 해당하기때문에 true값을 반환하고 300은 범위안에 해당하지 않기 떄문에 등호 2개로 비교할 수 없고
// 포장클래스의 내부값을 비교함으로 오버라이딩된 equals메소드로 비교하여야 한다.