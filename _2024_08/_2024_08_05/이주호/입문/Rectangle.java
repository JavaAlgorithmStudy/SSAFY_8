package _2024_08._2024_08_05.이주호.입문;
import java.util.*;

public class Rectangle {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] tmp = new int[score.length];
        int[] tmp2 = new int[score.length];
        for(int i=0;i<score.length;i++){
            tmp[i] = score[i][0]+score[i][1];
            tmp2[i] = score[i][0]+score[i][1];
        }
        Arrays.sort(tmp);
        int idx=1;
        for(int i=0;i<score.length;i++){
            for(int j = 0 ; j<score.length;j++){
                if(tmp[i] == tmp2[j]){
                    answer[i]=idx;
                    if(tmp2[i] != tmp[i+1]){
                        idx++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        //[[80, 70], [90, 50], [40, 70], [50, 80]]
        int[][] dots = {{80,70},{90,50},{40,70},{50,80}};
        System.out.println(rectangle.solution(dots));
    }
}
