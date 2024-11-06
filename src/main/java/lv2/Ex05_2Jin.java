package programmers_lv2;

public class Ex05_2Jin {

    // 10진수 -> 2진수(1,0)
    // Integer.toBinaryString()
    // 2진수(1,0) -> 10진수
    // Integer.parseInt("1000", 2)

    // Integer.toString(정수, 변환할 진법);

    //    0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
//
//    x의 모든 0을 제거합니다.
//    x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.

//    예를 들어, x = "0111010"이라면, x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.
//
//           0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과
//          정에서 제거된 모든 0의 '개수'를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.

//    "110010101001"	[3,8]
//            "01110"	[3,3]
//            "1111111"	[4,1]

//       회차	이진 변환 이전	제거할 0의 개수	0 제거 후 길이	이진 변환 결과
//        1 	"110010101001"	    6	            6	            "110"
//        2 	"110"	            1	            2	            "10"
//        3 	"10"	            1	            1	            "1"

    public static void main(String[] args) {
        String s = "01110";

        System.out.println(solution(s));
    }


    // while, replace, remove+=, Integer.toString(정수, 진법)

    // return [이진변환 회차,제거할 0의 개수]
    public static int[] solution(String s) {
        int removeCnt = 0;
        int eJinCnt = 0;

        while(!s.equals("1")) {

            // 초기 문자열 길이
            int beforeLength = s.length();

            // 문자열 s의 모든 0 제거
            String rs = s.replace("0", "");

            // 제거 후 길이
            int afterLength = rs.length();

            // 제거한 0 개수
            removeCnt += (beforeLength - afterLength);

            // 0 제거한 문자열 2진법처리
            s = Integer.toString(afterLength, 2);

            eJinCnt++;
        }

        int[] answer = {eJinCnt, removeCnt};

        return answer;
    }


    public static int[] solution2(String s) {
        int removeCnt = 0; // 제거한 0의 개수
        int eJinCnt = 0;   // 이진 변환 횟수

        while (!s.equals("1")) { // s가 "1"이 될 때까지 반복
            // 초기 문자열 길이
            int beforeLength = s.length();

            // 문자열 s의 모든 0 제거
            String rs = s.replace("0", "");

            // 제거 후 길이
            int afterLength = rs.length();

            // 제거한 0 개수
            removeCnt += (beforeLength - afterLength);

            // 0 제거한 문자열을 2진법으로 변환
            s = Integer.toBinaryString(afterLength); // 길이를 2진법으로 변환

            // 이진수 변환 횟수 증가
            eJinCnt++;
        }

        int[] answer = {eJinCnt, removeCnt}; // 결과 배열 생성
        return answer;
    }
}
