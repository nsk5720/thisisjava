package sec05.exam03_Button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//�ʵ� �ʱⰪ���� ���� (�͸� ���� ��ü)
	Button.onClickListener listener = new Button.onClickListener() {
		@Override
		public void onClick() {
			System.out.println("��ȭ�� �̴ϴ�.");
		}
	};
	Window(){
		button1.setOnClickListener(listener);
		
		//�Ű������� ����
		button2.setOnClickListener(new Button.onClickListener() {
			@Override
			public void onClick() {
				System.out.println("�޽����� �����ϴ�.");
			}
		});
	}
}
