public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000 * 1_000_000;
        long b = 1_000_000 * 1_000_000L;    // 올바른 값을 얻으려면 이렇게 a나 b를 long 타입으로 캐스팅 해야한다.

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
