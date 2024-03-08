package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        
        set.add("Java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Spring");
        
        Iterator<String> iterator = set.iterator(); //iterator 가져오는 방법

        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            
            //가져온 객체를 컬렉션에서 제거
            if (element.equals("JSP")) iterator.remove();
        }

        System.out.println();

        set.remove("JDBC");

        for (String element : set) {
            System.out.println(element);
        }

        for(int i = 0; i <set.size(); i++) {
            String element2 = set.toString();
        }
    }
}