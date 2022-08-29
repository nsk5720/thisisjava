package sec01_exam03_tosting;

public class SmartPhoneExample {

	public static void main(String[] args) {

		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);

	}

}