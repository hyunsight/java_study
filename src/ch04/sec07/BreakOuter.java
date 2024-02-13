package ch04.sec07;

public class BreakOuter {
    public static void main(String[] args) {
        //label의 이름은 직접 짓기 
        // - 완전히 중단하고 싶은 외부 반복문 앞에 label을 지정
        Outer: for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "_" + lower);

                //소문자가 g일 때 프로그램 끝내기
                if (lower == 'g') break Outer;
            }
        }
    }
}
