package sec01_exam01_equals;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override								/*오버라이드 후 재정의 하는 중*/
	public boolean equals(Object obj) {		/*ctrl + space -> e 누르고 2번째*/
		if(obj instanceof Member) {
			Member member = (Member) obj;  //지금 전달받은 놈을 형 변환
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
	