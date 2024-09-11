package _2024_07._2024_07_29.유영신.입문;

import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // String 타입의 result 변수 초기화
        String result = "";
        
        for(int i = 0; i < a.length(); i++) {
		        // .charAt() 메소드를 사용하면 특정 인덱스의 문자열 반환
            char charValue = a.charAt(i);
	           // .isUpperCase()는 해당 문자열이 대문자인지 확인하는 메소드
             if(Character.isUpperCase(charValue)) {
		             // Character.toLowerCase() 메소드를 사용하여 대문자 -> 소문자로 변경
                 result += Character.toLowerCase(charValue);
             } else {
	               // Character.toUpperCase() 메소드를 사용하여 소문자 -> 대문자로 변경
                 result += Character.toUpperCase(charValue);
             }
        }
       System.out.println(result);
    }
}