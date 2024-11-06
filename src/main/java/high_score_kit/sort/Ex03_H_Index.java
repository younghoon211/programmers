package sort;

import java.util.Arrays;

public class Ex03_H_Index {

    // 일반적인 풀이법
    public int solution(int[] citations) {
        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++) {
            int h = citations.length - i; // 인용된 논문의 수

            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }

        return answer;
    }



    //  오답
    public int solution2(int[] citations) {
        int a = 0;

        // a의 개수
        int cnt = 0;

        // 효율적 리소스 구성을 위해 오름차순 정렬
        Arrays.sort(citations);

        String[] arr = new String[citations.length];

        for(int i = 0; i<citations.length; i++) {
            arr[i] = String.valueOf(citations[i]);
        }

        // 각각의 값이 a 이상, charAt(i) >= a  cnt++ ,

        for (int i=0; i<citations.length; i++) {

            // 각각의 값이 a 이상일 경우, a에 cnt값 더하기
            if (citations[i] >= a) {
                a += cnt++;
            }

            // a의 개수와 a가 동일한 경우
            if (cnt == a) {
                return a;
            }
        }

        return a;
    }
}


