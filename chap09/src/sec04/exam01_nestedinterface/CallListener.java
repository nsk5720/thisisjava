package sec04.exam01_nestedinterface;

public class CallListener implements Button.onClickListener{
	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
}
