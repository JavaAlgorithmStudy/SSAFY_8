package _2024_09_13.이주호.입문;

public class 대문자와소문자 {
    public String solution(String my_string) {
        String answer = "";
        for(int i =0;i<my_string.length();i++){
            char c = my_string.charAt(i);
            if (Character.isUpperCase(c)){
                answer+=Character.toLowerCase(c);
            }else{
                answer+=Character.toUpperCase(c);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        대문자와소문자 s = new 대문자와소문자();
        System.out.println(s.solution("cccCCC"));
    }
}