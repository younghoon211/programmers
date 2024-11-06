package programmers_lv2;

// 최댓값과 최솟값
public class Ex04_JadenCase {

    public static void main(String[] args) {
        System.out.println(solution(" aaa sa ae 4q 11aaaa"));

    }

    public static String solution(String s) {

//        공백들을 공백 하나로 변환
//        String result = s.replaceAll("\\s+", " ");

        // 배열로 변환
        String[] arr = s.trim().split(" ");
        String[] arr2 = new String[arr.length];

        // 배열의 맨 앞글자 대문자, 뒷글자 소문자로 변경
        for (int i=0; i<arr.length; i++) {
            arr2[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase();
        }

        // 다시 문자열로 변환
        String answer = String.join(" ", arr2);

        return answer;
    }
}
