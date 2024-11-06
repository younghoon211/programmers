package programmers_lv1;

public class Ex01_EvenOrOdd {
    public String solution(int num) {
        if (num % 2 == 0) return "Even";
        else return "Odd";
    }

    public String solution2(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
