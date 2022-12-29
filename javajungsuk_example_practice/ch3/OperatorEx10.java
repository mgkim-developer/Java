public class OperatorEx10 {
    public static void main(String[] args) {
        int a = 1000000;

        int result1 = a * a / a;    // 1000000 * 100000 / 1000000
        int result2 = a / a * a;    // 1000000 / 100000 * 1000000

        System.out.printf("%d * %d / %d = %d%n", a, a, a, result1); // 먼저 곱하는 경우 int의 범위를 넘어서기 때문에 예상했던 것과 다른 결과가 나온다..
        System.out.printf("%d / %d * %d = %d%n", a, a, a, result2);
    }
}
