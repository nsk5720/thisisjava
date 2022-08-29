package sec04.exam01_nestedinterface;

public class Button {
	onClickListener listener;
	
	void setonClickListener(onClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface onClickListener{          //���⼺: ��ġ�� �ؼ� ��ȭ�� �ɰų� ���ڸ� �����ų� ��� �������� ���� �� �� �ְ� ���� �׷��� �������̽� ���
		void onClick();
	}
}
