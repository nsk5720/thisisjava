package sec04.exam01_objects;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		//System.out.println(Objects.requireNonNull(str2));		빨간색 안나오게 할려면 try catch문 써야함
		try {
			String name = Objects.requireNonNull(str2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");		//친절하게 이름이 없다고 안내
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, ()->"이름이 없다니깐요");		//람다식?
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
