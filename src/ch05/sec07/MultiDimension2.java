package ch05.sec07;

public class MultiDimension2 {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3]; // {{0, 0, 0}, {0, 0, 0}} -> 행렬로 생각하면 쉬움 (2행 3열의 데이터가 만들어짐)

        //2차원 배열에 값을 할당하지 않을 경우 디폴트 값 출력
        for (int i = 0; i < mathScores.length; i++) { //행
            for (int j = 0; j < mathScores[i].length; j++) { //열
                System.out.println("mathScores[" + i + "][" + j + "]" + mathScores[i][j]);
            }
        }
    }
}
