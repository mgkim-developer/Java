import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_9 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lambda", "stream",
                "OptionalDouble", "intStream", "count", "sum"
        };

        Stream.of(strArr).forEach(System.out::println);
//        Stream.of(strArr).parallel().forEach(System.out::println);  // 병렬로 처리
//        Stream.of(strArr).parallel().forEachOrdered(System.out::println);  // 병렬로 처리하면서 순서 보장

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strArr).parallel()
                                        .filter(s -> s.charAt(0) == 's').findAny();

        System.out.println("noEmptyStr=" + noEmptyStr);
        System.out.println("sWord=" + sWord.get());

        // Stream<String>을 Stream<Integer>으로 변환 (s) -> s.length()
        // {"Inheritance", "Java", "Lambda", "stream", "OptionalDouble", "intStream", "count", "sum"}
        // -> {11, 4, 6, 6, 14, 9, 5, 3}
//        Stream<Integer> intStream1 = Stream.of(strArr).map(String::length);

        // Stream<String>을 IntStream으로 변환. IntStream는 성능이 좋은 기본형 스트림.
        IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intStream1.reduce(0, (a, b) -> a + 1);
        int sum = intStream2.reduce(0, (a, b) -> a + b);

        OptionalInt max = IntStream.empty().reduce(Integer::max);
        OptionalInt min = intStream4.reduce(Integer::min);
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
        System.out.println("max+" + max.orElse(0));
        System.out.println("max=" + max.orElseGet(() -> 0));
        System.out.println("min=" + min.getAsInt());


    }
}
