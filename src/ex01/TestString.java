package ex01;

public class TestString {

	public static void main(String[] args) {
		String name1 = "이순신";
		String name2 = "이순신";
		String name3 = new String("이순신"); //new : heap에 새로운 메모리 생성
		String name4 = new String("이순신"); // 또 다른 heap에 새로운 메모리 생성

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		if(name1 == name2) {  //주소비교 : heap의 같은 위치
			System.out.println("같은 이름");
		}else {
			System.out.println("다른 이름");
		}

		if(name3 == name4) { // 주소가 다른 heap의 위치
			System.out.println("같은 이름");
		}else {
			System.out.println("다른 이름");
		}
		
		if(name3.equals(name4)) { // 주소가 다른 heap의 위치
			System.out.println("같은 이름");
		}else {
			System.out.println("다른 이름");
		}
		//문자열 비교
		String name5 = "이순신";
		String name6 = "이이";
		
		if(name5.compareTo(name6)>0) { //name5 > name6
			System.out.println("이순신이 크다.");
		}else if(name5.compareTo(name6) == 0) { //name5 = name6
			System.out.println("이순신 == 이이");
		}else {
			System.out.println("이이가 크다");
		}
		
	}

}
