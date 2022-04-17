public class RoundTest {

    public static void main(String[] args) {
        double sum = 0;
        double sum1 = 0 ;
        double sum2 = 0;

        for (double d = 1.5; d <= 10.5; d = d + 1) {
            double d1 = Math.round(d);
            double d2 = Math.rint(d);

            System.out.printf("%4.1f %4.1f %4.1f%n", d, d1 ,d2);

            sum = sum + d;
            sum1 = sum + d1;
            sum2 = sum + d2;
        }

        System.out.println("---------------");
        System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);

    }
}
