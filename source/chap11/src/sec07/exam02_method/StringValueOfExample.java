package sec07.exam02_method;

public class StringValueOfExample {

	public static void main(String[] args) {
		String str1 = String.valueOf(10);			//valueOf로 계산할 수 없는 String으로 바뀜
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);

	}

}
