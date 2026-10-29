package ex03;

import java.util.Objects;

//자바의 모든 class는 기본으로 Object class 상속받는다.
class A extends Object{
	/* equals() : 객체 비교
	 * toString() : 객체이름을 출력할때
	 * hashCode() : 객체의 heap의 위치
	 * getClass() : 클래스 정보 가지고온다.
	 * */
}

class Member{
	private String name;
	private String phone;
	
	public Member() {
		System.out.println("member class입니다.");
	}
	public Member(String name, String phone) {
		this(); //기본생성자 호출
		this.name = name;
		this.phone = phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public void info() {
		System.out.println("이름: "+name + "전화번호: "+phone);
	}
	@Override
	public String toString() { //디버깅용
		return "Member [name=" + name + ", phone=" + phone + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}
	//m1.equals(m)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}
	
}

public class TestMember {

	public static void main(String[] args) {
		Member m0 = new Member();
		m0.setName("이승우");
		m0.info();
		
		Member m1 = new Member("손흥민","010-1111-2222");
		Member m2 = new Member("안정환","010-2222-3333");
		Member m3 = new Member("차범근","010-3333-4444");
		
		Member m = new Member("손흥민","010-1111-2222");
		//객체(인스턴스)비교 == 주소로 비교
		System.out.println(m == m1);
		
		System.out.println(m1.equals(m)); //false(오버라이드 전)
	
		A a = new A();
		
		System.out.println(m1.getClass());
		System.out.println(m1.toString());
		System.out.println(m1.hashCode());
		
		System.out.println(m);
		System.out.println(m1);
		
	}
}
