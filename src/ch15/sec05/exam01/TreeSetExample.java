package ch15.sec05.exam01;

import ch13.sec05.Person;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(87); //TreeSet은 데이터 저장 시, add 사용
        scores.add(98);
        scores.add(75);
        scores.add(95);
        scores.add(80);

        //정렬된 Integer 객체를 하나씩 가져오기
        for (Integer s : scores) {
            System.out.println(s + " ");
        }

        System.out.println(); //기본적으로 오름차순으로 가져옴

        //특정 Integer 객체 가져오기
        System.out.println("가장 낮은 점수: " + scores.first()); //가장 낮은 객체
        System.out.println("가장 높은 점수: " + scores.last()); //가장 높은 객체
        System.out.println("95점 아래 점수: " + scores.lower(95)); //() 바로 아래 있는 객체
        System.out.println("95점 위의 점수: " + scores.higher(95)); //() 바로 위에 있는 객체
        System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95)); //95점이 있으면 95점 가져오고, 없으면 바로 아래에 있는 객체 가져옴
        System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85)); //85점이 있으면 85점 가져오고, 없으면 바로 위에 있는 객체 가져옴

        //내림차순 정렬
        NavigableSet<Integer> descendingScores = scores.descendingSet();

        for(Integer s : descendingScores) {
            System.out.println(s + " ");
        }

        System.out.println();

        //범위 검색(80 <= )
        // - tailSet(fromElement, inclusive): 주어진 객체보다 높은 객체를 가지고 온다.
        // - 두번째 매개변수는 해당 객체를 포함하고 싶으면 true, 포함하고 싶지 않으면 false
        NavigableSet<Integer> rangeSet = scores.tailSet(80, true); //false로 바꿀 경우, 80은 제외하고 가져옴
        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }

        System.out.println();

        //범위 검색 (80 <= score < 90)
        // - subSet(fromElement, fromInclusive, toElement, toInclusive): 시작과 끝으로 주어진 사이의 객체들을 구한다.
        rangeSet = scores.subSet(80, true, 90, false);
        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }

        System.out.println();

        //범위 검색 (<= 87)
        //headSet(toElement, inclusive): 주어진 객체보다 낮은 객체를 가지고 온다.
        rangeSet = scores.headSet(87, true);
        for (Integer s : rangeSet) {
            System.out.println(s + " ");
        }
    }
}
