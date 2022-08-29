package test02.test02;

public class Chatting {
		void startChat(String chatId) {
			//로컬클래스Chat을 한 번의 선언을 에서 nickName이라는 로컬변수를 사용하면 final특성을 갖기 때문에 한 번의 선언을 해주어야함
			//그러므로 이 부분해주는 String nickName = chatId; 로 변경해야 오류가 안뜸
			
			String nickName = null;	
			nickName = chatId;
			
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