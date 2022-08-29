package sec01_exam01_equals;

public class Member {
	
	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	@Override								/*�������̵� �� ������ �ϴ� ��*/
	public boolean equals(Object obj) {		/*ctrl + space -> e ������ 2��°*/
		if(obj instanceof Member) {
			Member member = (Member) obj;  //���� ���޹��� ���� �� ��ȯ
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
	