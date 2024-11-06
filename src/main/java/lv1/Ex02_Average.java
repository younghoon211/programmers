package programmers_lv1;

import java.util.Arrays;

public class Ex02_Average {
    public Double solution(int[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }

    public Double solution2(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public Double solution3(int[] arr) {
//        return Arrays.stream(arr).average().orElse(0);
        // orElse(0);
        // getAsDouble();
//        return IntStream.of(arr).sum() / arr.length;
        return null;
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println("Arrays.stream(arr).average() = " + Arrays.stream(arr).average());
    }
}
