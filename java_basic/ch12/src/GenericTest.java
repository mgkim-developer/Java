import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();   // JDK1.5이전   지네릭스 도입이전
        ArrayList<Object> list = new ArrayList<Object>(); // JDK1.5이후
        list.add(10);   // list.add(new Integer(10));
        list.add(20);   // list.add(new Integer20));
        list.add("30");   // 타입 체크가 강화됨. 지네릭스 덕분에

//        Integer i = (Integer)list.get(2);   // 컴파일 OK / 컴파일러의 한계
//        Integer i = list.get(2);   // 형변환 생략 가능 (지네릭스 사용해서)
        String i = (String)list.get(2);   // 형변환 생략 가능 (지네릭스 사용해서)


        System.out.println(list);
    }
}
