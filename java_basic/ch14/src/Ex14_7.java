import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_7 {
    public static void main(String[] args) {
        Stream<String[]> strArrStrm = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

//        Stream<Stream<String>> strStrmStrm = strArrStrm.map(Arrays::stream);
        Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);

        strStrm.map(String::toLowerCase)    // 스트림의 요소를 모두 소문자로 변경
                .distinct() // 중복 제거
                .sorted()   // 정렬
                .forEach(System.out::println);
        System.out.println();



        String[] lineArr = {
                "Believe or not It is true",    // 이렇게 문장이 있을 때 단어 하나하나를 Stream요소로 만들고 싶을 때도 flatMap()을 사용해야한다.
                "Do or do not There is no try",
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        // line은 String 문자열인데, 이것을 String[] 문자열배열로 바꾸고 싶을 때 이것을 map으로 변환하려하면,
        // Stream<String>이 Stream<Stream<String>이 된다.
        // 그래서 flatMap()으로 변환해줘야 한다.  그러면 Stream<String>이 Stream<String>이 된다.
        lineStream.flatMap(line -> Stream.of(line.split(" +"))) // " +"는 정규식기호인데 "하나이상의 공백"을 의미,
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);
        System.out.println();
    }
}
