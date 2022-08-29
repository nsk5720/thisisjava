package sec05.exam03_Button_event;

public class Button {
	onClickListener listener;
	void setOnClickListener(onClickListener listener) {
		this.listener = listener;
	}
	void touch() {
		listener.onClick();
	}
	
	interface onClickListener {
		void onClick();
	}
}
