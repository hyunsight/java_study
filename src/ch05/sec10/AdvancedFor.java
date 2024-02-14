package ch05.sec10;

public class AdvancedFor {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};

        //합계, 평균 구하기
        int sum = 0;
        for (int score : scores) {
            System.out.println(score);
            sum += score;
        }

        double avg = (double) sum / scores.length;
        System.out.println("평균점수: " + avg);
    }
}
