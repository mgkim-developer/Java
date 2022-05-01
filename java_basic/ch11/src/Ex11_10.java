import java.util.*;

class Ex11_10 {
    public static void main(String[] args) {
        Set set = new HashSet();

        // set의 크기가 6보다 작은동안 1~45사이의 난수를 저장
        for (int i = 0; set.size() < 6; i = i + 1) {
            int num = (int)(Math.random()*45) + 1;
//            set.add(new Integer(num));
            set.add(num);
        }

        // set은 정렬불가이므로 set을 list로 옮기고 list로 정렬해야함
        List list = new LinkedList(set);    // LinkedList(Collection c)
        Collections.sort(list);             // Collections.srot(List list)
        System.out.println(list);
    }
}