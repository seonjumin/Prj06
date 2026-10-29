package ex05;

import java.text.MessageFormat;
import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		System.out.println("문자열갯수: "+"Hello".length());
		System.out.println("문자열갯수: "+"안녕하세요".length());
				//    012345 6 7 8 9
		String str = "Java 프로그래밍";
		System.out.println("1위치의 글자:" + str.charAt(1));
		System.out.println("5위치의 글자:" + str.charAt(5));
		
		String str2 = "Hello World";
		System.out.println("" + str2.substring(0, 4)); //원하는 위치의 글자 자르기
		System.out.println("" + str2.substring(5));
		
		
		String str3 = "banana";
		System.out.println("문자(a)의 위치: "+str3.indexOf('a')); //1
		System.out.println("문자(a)의 위치: "+str3.indexOf('a',2)); //2 다음으로 찾아라
		System.out.println("문자(a)의 위치: "+str3.lastIndexOf('a')); //뒤에서부터 찾아라
		
		//~를 포함하는
		String str4 = "apple pie";
		System.out.println("pie 문자열을 포함하는가?" + str4.contains("pie"));
		
		//~로 시작되는
		String str5 = "filename.java";
		System.out.println("file 이 포함?:"+str5.startsWith("file"));
		System.out.println("file의 위치?:"+str5.indexOf("file"));
		
		//~로 끝나는
		System.out.println(".java로 끝나는:" + str5.endsWith(".java"));
		
		String str6 = "Java";
		String str7 = "java";
		System.out.println(str6.equals(str7));
		System.out.println(str6.equalsIgnoreCase(str7));
		
		System.out.println(str6.toUpperCase());
		System.out.println(str6.toLowerCase());
		
		String str8 = "     짱구        ";
		System.out.println(str8);
		System.out.println(str8.length());
		
		System.out.println(str8.trim());
		System.out.println(str8.trim().length());
		
		String str9 = "I love Java";
		System.out.println(str9);
		System.out.println(str9.replace("Java", "Python"));
		System.out.println(str9); //str9은 원래 그대로임 출력할때만 바뀐 것
		str9 = str9.replace("Java","Python"); //바꾼것을 변수에 다시 넣으면 바뀜
		System.out.println(str9);
		System.out.println(str9.isBlank());
		
		//문자열 분리 -> 문자열 배열
		String str10 = "red,green,blue";
		System.out.println(str10);
		String[] colorArr = str10.split(",");
		System.out.println(Arrays.toString(colorArr));
		System.out.println(colorArr[0]);
		System.out.println(colorArr[1]);
		System.out.println(colorArr[2]);
		
		String empty = "";
		String blank = " ";
		System.out.println(empty.length());
		System.out.println(blank.length());
		System.out.println(empty.isEmpty());
		System.out.println(blank.isBlank());
		
		String name = "Alice";
		int age = 22;
		String msg = String.format("이름:%s 나이:%d",name,age);
		System.out.println(msg);
		
		String msg2 = MessageFormat.format("이름:{0}, 나이:{1}",name,age);
		System.out.println(msg2);
		
		String result = String.join("-", colorArr);
		System.out.println(result);
		
		String result2 = String.join("-", "20226","10","29");
		System.out.println(result2);
		
		String star = "*";
		System.out.println(star.repeat(5));
	}

}
