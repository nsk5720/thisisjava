package test02.test02;

public class Chatting {
		void startChat(String chatId) {
			// Chat라는 로컬 클래스에서 nickName이라고 하는 로컬 변수를 사용하고 있으면 nickName은 final 특성을 갖기 때문에
			// 아래에 코드처럼 한 번 값을 주면 변경할 수 없다.
			String nickName = chatId;				//<=이게 정답
			//String nickName = null;	
			//nickName = chatId;
			// 위 2 줄을 String (String nickName = chatId;) 로 수정해야한다.
			Chat chat = new Chat() {
				@Override
				public void start() {
					while(true) {
						String inputData = "안녕하세요 " ;
						String message = "[" + nickName + "] " + inputData;
						sendMessage(message);
					}
				}
			};
			chat.start();
		}
		class Chat {
			void start() {}
			void sendMessage(String message) {}
		}
	
}
//nickName은 final값을 갖게 되는데 null값과 chatId값을 부여해서?