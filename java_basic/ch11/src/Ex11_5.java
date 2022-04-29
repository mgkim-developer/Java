import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

class Ex11_5 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

//        HashSet c = new HashSet();   // HashSet은 Collection의 자손

        c.add("1");
        c.add("2");
        c.add("3");
        c.add("4");
        c.add("5");

        Iterator it = c.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        //  iterator는 1회용이라 다 쓰고나면 다시 얻어와야 한다.
//        it = c.iterator();   // 새로운 iterator객체를 얻는다.
//
//        while(it.hasNext()) {
//            Object obj = it.next();
//            System.out.println(obj);
//        }

//        for (int i = 0; i < c.size(); i = i + 1) {
//            Object obj = c.get(i);   // HashSet에는 get메서드가 없다.
//            System.out.println(obj);
//        }


    }   // main
}