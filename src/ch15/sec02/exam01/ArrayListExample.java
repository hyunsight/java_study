package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList 정의 방법
        // - 상기 2가지의 제네릭 쓴 방법이 명확해서 조금 더 나은 코드임 (어떤 타입 썼는지 명시해주므로)
        // - 제네릭의 장점으로 별도 형변환하지 않고 사용할 수 있음
        // - List는 Collection으로부터 상속받고 있음

        //1, 2안
        // - E에 지정된 타입 객체만 저장
        List<Board> list = new ArrayList<Board>();
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));

        Board board = list.get(2);
        System.out.println(board.getSubject() + " " + board.getWriter());

        list.remove(1);

        //전체 리스트 가져오기 위해서는 for문 사용 필요
        for(int i = 0; i < list.size(); i++) {
            Board board2 = list.get(i);
            System.out.println(board2.getSubject() + " " + board2.getWriter());
        }

        for(Board b : list) {
            System.out.println(b.getSubject() + " " + b.getWriter());
        }

        // - 뒷 <> 안의 타입은 생략 가능
        List<Board> list2 = new ArrayList<>();
        list2.add(new Board("제목1", "내용1", "글쓴이1"));
        //list2.add("문자열 객체"); //에러 발생

        //3, 4안
        // - 모든 타입 객체 저장 (별도 제네릭 지정 X)
        // - 제네릭을 지정하지 않으면 디폴트 타입은 Object임
        List list3 = new ArrayList();
        list3.add(new Board("제목1", "내용1", "글쓴이1"));
        list3.add("문자열 객체");

        ArrayList list4 = new ArrayList();
        list4.add(new Board("제목1", "내용1", "글쓴이1"));
        list4.add("문자열 객체");
    }
}
