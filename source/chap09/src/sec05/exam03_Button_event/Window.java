package sec05.exam03_Button_event;

public class Window {
	Button button1 = new Button();
	Button button2 = new Button();
	
	//필드 초기값으로 대입 (익명 구현 객체)
	Button.onClickListener listener = new Button.onClickListener() {
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	Window(){
		button1.setOnClickListener(listener);
		
		//매개값으로 대입
		button2.setOnClickListener(new Button.onClickListener() {
			@Override
			public void onClick() {
				System.out.println("메시지를 보냅니다.");
			}
		});
	}
}
