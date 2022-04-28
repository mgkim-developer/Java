import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Ex11_2 {
    public static void main(String[] args) {
        Stack st = new Stack();
        Queue q = new LinkedList(); // Queue인터페이스의 구현체인 LinkedList클래스 이용

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("0");
        q.offer("1");
        q.offer("2");

        System.out.println("= Stack = ");
        while(!st.empty()) {    // 스택이 비어있지 않은지 확인해서 비어있지 않으면 반복
            System.out.println(st.pop());   // 스택에서 요소 하나를 꺼내서 출력
        }

        System.out.println("= Queue =");
        while(!q.isEmpty()) {   // 큐가 비어있지 않은지 확인해서 비어있지 않으면 반복
            System.out.println(q.poll());   // 큐에서 요소 하나를 꺼내서 출력
        }
    }
}
