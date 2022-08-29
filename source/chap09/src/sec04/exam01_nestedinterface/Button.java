package sec04.exam01_nestedinterface;

public class Button {
	onClickListener listener;
	
	void setonClickListener(onClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface onClickListener{          //다향성: 터치를 해서 전화를 걸거나 문자를 보내거나 등등 여러가지 일을 할 수 있게 만듬 그래서 인터페이스 사용
		void onClick();
	}
}
