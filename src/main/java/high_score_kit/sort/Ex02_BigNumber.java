package sort;

import java.util.Arrays;

public class Ex02_BigNumber {

    public static void main(String[] args) {
        int[] numbers = {0};
        System.out.println(solution(numbers));
    }

    // String.join
    public static String solution(int[] numbers) {
        String[] str = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(str, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        return String.join("", str);
    }


    // StringBuilder
    public static String solution2(int[] numbers) {

        String[] arr = new String[numbers.length];

        for (int i=0; i<numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            sb.append(arr[i]);
        }

        String answer = String.valueOf(sb);

        return answer;
    }

}





