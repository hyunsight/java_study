package ch11.sec03.exam01;

public class ExceptionHandling {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]:" + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
            }
//            catch (NumberFormatException e) {
//                System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
//
//            }
            catch (Exception e) {
                //상위 클래스는 가장 아래에 작성
                // - 모든 에러들은 Exception(가장 상위)으로부터 상속 받고 있음 -> 따라서 어떤 exception이 오더라도 'Exception' 최상위에서 실행할 경우, 해당 Exception에서 다 걸리기 때문에 나머지 다른 하위 exception들은 필요 없음
                // - 다른 Exception과 같이 쓸 경우, 부모 Exception은 가장 하단에서 써줘야 함 (세부적으로 잡고 싶은 Exception은 위에서 작성)
                System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
            }
        }
    }
}
