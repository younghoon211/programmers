package sort;

import java.util.Arrays;

// K번째 수
public class Ex01_KNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(solution(array, commands));
    }

//          array	                            commands	                     return
//     [1, 5, 2, 6, 3, 7, 4]    	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	        [5, 6, 3]

    // Arrays.sort , Arrays.copyOfRange(array, Startidx, Endidx)
    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];


        for (int i = 0; i < commands.length; i++) {
            //                                    comm에선 [2, 5]가 2,3,4,5인데 배열에선 1,2,3,4 이므로
            int[] arr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

            // k번째 수 (배열에선 -1)
            int k = commands[i][2];
            Arrays.sort(arr);

            answer[i] = arr[k - 1];
        }

        // answer의 개수는 i의 길이
        return answer;
    }
}

