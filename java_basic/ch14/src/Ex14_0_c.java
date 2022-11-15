import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_0_c {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream(); // list를 데이터 소스로 하는 새로운 stream을 생성
        intStream.forEach(System.out::println);

        // streamdms 1회용. stream에 대해 최종 연산을 수행하면 stream이 닫힌다.
        intStream = list.stream(); // 위의 최종연산 뒤에 스트림 재생성
        intStream.forEach(System.out::println); //

        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        String[] strArr = new String[]{"a", "b", "c", "d"};
//        Stream<String> strStream2 = Stream.of(strArr); // 이것과
        Stream<String> strStream2 = Arrays.stream(strArr); // 이것 중에 편한거 선택해서 사용 값. 둘의 값은 같다.
        strStream2.forEach(System.out::println);

        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream1 = Arrays.stream(intArr);
//        intStream1.forEach(System.out::println);
//        System.out.println("count=" + intStream1.count());
//        System.out.println("sum=" + intStream1.sum());
        System.out.println("average=" + intStream1.average());

        Integer[] intArr2 = {1, 2, 3, 4, 5};
        Stream<Integer> intStream2 = Arrays.stream(intArr2);
//        intStream2.forEach(System.out::println);
        System.out.println("count=" + intStream2.count());
    }
}
