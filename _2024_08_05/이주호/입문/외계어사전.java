package _2024_08_05.이주호.입문;

import java.util.*;
class 외계어사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        Arrays.sort(spell);
        String str = String.join("",spell);
        for(String word : dic){
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String str1 = new String(c);

            if(str.equals(str1)){
                return 1;
            }
        }
        return 2;
    }

    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        외계어사전 s = new 외계어사전();

        System.out.println(s.solution(spell,dic));
    }
}
