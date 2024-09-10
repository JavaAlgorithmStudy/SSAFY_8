package _2024_08_22.이주호;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class SWEA_2930_Heap {

    static List<Integer> pqCustom;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        for(int t=1; t<=T; t++){
            StringBuilder sb = new StringBuilder();
            sb.append("#").append(t).append(" ");

            int n = Integer.parseInt(br.readLine());

            pqCustom = new ArrayList<>();//최대힙 pq
            pqCustom.add(null);
            for(int i = 0 ; i<n;i++){
                String[] input = br.readLine().split(" ");
                if(input[0].equals("1")){
                    pqCustom.add(Integer.parseInt(input[1]));
                    shiftUp(pqCustom.size()-1); //새로 들어오면 맨 뒤에 넣고 정렬
                }else {
                    if(pqCustom.size()==1) {
                        sb.append("-1 ");
                    }else{
                        sb.append(pqCustom.get(1)).append(" "); //맨 위 붙이고 삭제 그리고 맨 위에 맨 뒤 값 삽입

                        pqCustom.set(1,pqCustom.get(pqCustom.size()-1));
                        pqCustom.remove(pqCustom.get(pqCustom.size()-1));

                        if (pqCustom.size()>1){
                            shiftDown(1); //젤 작은 요소 맨 위로 올렸다면, 정렬
                        }
                    }
                }
            }
            System.out.println(sb);
        }
    }

    static void shiftUp(int index) {
        while(index>1 && pqCustom.get(index) > pqCustom.get(index/2)){ //작은 요소가 부모 자리에 있다면 바꿔줌.
            int tmp = pqCustom.get(index);
            pqCustom.set(index, pqCustom.get(index / 2)); //자식 idx에 부모 값 삽입
            pqCustom.set(index/2,tmp); //부모 idx에 자식 값 삽입.

            index = index/2; //반복을 위해 조건 변경
        }
    }

    static void shiftDown(int index) {
        while (index*2 < pqCustom.size()){
            int child = index*2;
            if(child+1 < pqCustom.size() && pqCustom.get(child+1) > pqCustom.get(child)){ //오른쪽 노드가 더 크고 범위 내라면 오른쪽 노드로 변경
                child++;
            }
            if (pqCustom.get(index) >= pqCustom.get(child)){
                break;
            }

            int tmp = pqCustom.get(index);
            pqCustom.set(index, pqCustom.get(child));
            pqCustom.set(child, tmp);

            index = child;
        }
    }
}
