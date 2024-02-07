package ch02.sec06;

public class StringExample {
    public static void main(String[] args) {
        //char var1 = "A"; //char 타입은 "" 큰따옴표 사용 X
        char var1 = 'A';
        //char var2 = "홍길동"; //char 타입은 문자를 1개 밖에 못씀
        String var2 = "홍길동";

        String name = "홍길동";
        String job = "프로그래머";

        System.out.println(name + "은 " + job + "입니다.");

        //쌍따옴표 출력
        String str = "나는 \"자바\"를 배웁니다.";
        System.out.println(str);

        //tab 만큼 띄어쓰기 (참조! 스페이스바를 통해 띄어쓰기도 작동하므로 쓸일이 많지는 않음 => 스페이스바로 사용)
        str = "번호\t이름\t직업";
        System.out.println(str);

        //줄바꿈
        System.out.println("나는\n자바를\n배웁니다.");
    }
}
