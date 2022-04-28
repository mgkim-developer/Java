import java.util.ArrayList;
import java.util.Collections;

class Ex11_1 {
    public static void main(String[] args) {
        // 기본길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장가능
        // autoboxing에 의해 기본형이 참조형으로 자동 변환
        // list1.add(5); → list1.add(new Integer(5));
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        // ArrayList(Collection c)
        // ArrayList의 일부를 뽑아서 새로운 리스트를 생성 인덱스(1, 2, 3) 즉, 4, 2, 0 을 뽑아서 생성
        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        // Collection은 인터페이스, Collections는 유틸 클래스
        Collections.sort(list1);    // list1과 list2를 정렬한다.
        Collections.sort(list2);    // Collections.sort(List 1)
        print(list1, list2);

        // list1이 list2의 모든 요소를 포함하고 있는가?
        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        // list1의 index 0에 문자열 1 넣기
        list1.add(0, "1");
        // list1의 index0은 문자열1, index2는 integer 1
//        System.out.println("index="+ list1.indexOf(new Integer("1")));
        System.out.println("index="+ list1.indexOf("1"));
//        System.out.println("index="+ list1.indexOf(new Integer(1)));
        System.out.println("index="+ list1.indexOf(1));

//        list1.remove(1);    // 인덱스가 1인 객체를 삭제
        list1.remove(new Integer(1));   // Integer 1을 삭제

        print(list1, list2);


        // list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
        System.out.println("List1.retainAll(list2):" + list1.retainAll(list2));

        print(list1, list2);

        // list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i = list2.size() - 1; i >= 0; i = i - 1) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:" + list1);
        System.out.println("list2:" + list2);
        System.out.println();
    }
}
