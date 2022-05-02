import java.util.*;

class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet();    // 범위 검색, 정렬에 유리함. 따로 정렬 필요 없음
//        Set set = new HashSet();    //정렬 필요
//
        for (int i = 0; set.size() < 6; i = i + 1){
            int num = (int)(Math.random()*45)+1;
//            set.add(new Test());
            set.add(new Integer(num));


        }
        System.out.println(set);
    }
}

class Test implements Comparable {
    @Override
    public int compareTo(Object o) {
        return -1;
    }
} // 비교 기준이 없음

class TestComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return 1;
    }
}