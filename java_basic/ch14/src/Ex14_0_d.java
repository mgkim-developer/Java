import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0_d {
    public static void main(String[] args) {
        IntStream intStream = new Random().ints();
        intStream
                .limit(5) // 5개만 자르기
                .forEach(System.out::println);

        IntStream intStream2 = new Random().ints(5);
        intStream2
                .forEach(System.out::println);

        IntStream intStream3 = new Random().ints(5, 10);
        intStream3
                .limit(10)
                .forEach(System.out::println);

        // iterate(T seed, UnaryOperator f) : UnaryOperator 단항 연산자
        Stream<Integer> integerStream = Stream.iterate(1, n -> n + 2);
        integerStream.limit(10).forEach(System.out::println);

        // generate(Supplier s) : 주기만 하는 것이므로 입력 X, 출력 O
        Stream<Integer> generateStream = Stream.generate(() -> 1);
        generateStream.limit(10).forEach(System.out::println);
    }
}
