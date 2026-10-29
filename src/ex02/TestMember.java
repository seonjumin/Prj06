package ex02;

class Member{
	private String name;
	private String email;
	
	public Member() {
		
	}
	
	public Member(String name, String email){
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}
	
	public void info() {
		System.out.println("이름: "+name+"이메일: "+email);
	}
}

public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member("박찬호","park@gmail.com");
		m1.info();
		
		Member m2 = new Member("류현진",null);
		m2.info();
			
		m2.setEmail("ryu@gmail.com");
		m2.info();
		
		System.out.println(m2.getName());
	}
}
