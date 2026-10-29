package ex04;

import java.util.Objects;

class Member{
	private String name;
	private String phone;
	private int bYear;
	
	public Member(){
		
	}
	public Member(String name, String phone, int bYear) {
		this.name = name;
		this.phone = phone;
		this.bYear = bYear;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public int getbYear() {
		return bYear;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", phone=" + phone + ", bYear=" + bYear + "]";
	}

	@Override
	public boolean equals(Object obj) {  //mArr[0] == m
		Member other = (Member) obj;
//		return bYear == other.bYear && Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
		return this.name.equals(other.name);
	}
	
	
}
public class TestMember {

	public static void main(String[] args) {
		
		Member [] mArr = new Member[3]; //배열 공간을 만드는 new
		//그냥 값을 넣는것이 아닌 생성자를 이용하여 값을 넣은 것을 배열에 넣는것이므로 new를 사용해야함.
		mArr[0] = new Member("강호동","010",1980);
		mArr[1] = new Member("서장훈","011",1983);
		mArr[2] = new Member("김연아","012",1990);
		
		System.out.println("전체 목록");
		for(int i = 0; i<mArr.length; i++) {
			System.out.println(mArr[i]);
		}
		
		//김연아를 찾아서 정보 출력
		Member m = new Member("김연아", null, 0);
		System.out.println("찾은 정보");
		for(int i=0; i <mArr.length; i++) {
			if(mArr[i].equals(m)) {
				System.out.println(mArr[i]);
			}
		}
	}

}
