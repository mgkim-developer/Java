public class Ex14_0 {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b // 람다식. 익명 객체

        Object obj = new Object() {
            int max(int a, int b) {
                return a > b  ? a : b;
            } // 자바 규칙에서는 메서드만 존재할 수 없기 떄문에 이렇게 익명 객체안에 넣어서 표현해야 한다. 람다식은 이것을 간단히 표현한 것이다.
        };

//        int value = obj.max(3, 5); // 분명히 위의 객체에는 max를 가지고 있지만, Object 타입의 리모컨에는 max 버튼이 없어서 호출할 수가 없다.
        // 그래서 함수형 인터페이스를 사용해야 한다. 다음시간에 알아볼 것이다.
    }
}
