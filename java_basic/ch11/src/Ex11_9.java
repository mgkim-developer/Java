import java.util.*;

class Ex11_9 {
    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2","2","3","3","4","4","4"};
        Set set = new HashSet();

        for(int i = 0; i < objArr.length; i = i + 1) {
            System.out.println(objArr[i]+"="+set.add(objArr[i])); // HashSet에 objArr의 요소들을 저장한다.
        }
        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);    // 중복된 것은 삭제되었고, 1은 같은게 2개처럼 보이지만, "1"과 숫자 1은 다르다.
                                    // 순서유지도 되지 않는다. 지금은 순서가 유지된 것처럼 보이지만, 원래 순서는 유지되지 않는게 Set의 특징이다.

        // HashSet에 저장된 요소들을 출력한다. (Iterator 이용)
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}