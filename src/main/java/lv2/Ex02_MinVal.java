package programmers_lv2;

import java.util.Arrays;

// 최솟값 만들기
public class Ex02_MinVal {

    public static void main(String[] args) {
//        System.out.println(solution());
    }


    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[A.length-1-i];
        }

        return answer;
    }

}
