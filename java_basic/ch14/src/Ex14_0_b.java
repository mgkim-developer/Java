import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_0_b {
    public static void main(String[] args) {
//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);

//        Function<String, Integer> f = 클래스이름:: 메서드이름;
        Function<String, Integer> f = Integer::parseInt;    // 메서드 참조

//        Function<String, Integer> f = (String s) -> Integer.parseInt(s);    // 람다식
        System.out.println(f.apply("100")+200);

        // Supplier는 입력X, 출력O
//        Supplier<MyClass> s = () -> new MyClass();
//        Supplier<MyClass> s = 클래스이름::메서드이름;
//        Supplier<MyClass> s = MyClass::new;

//        Function<Integer, MyClass> k = (i) -> new MyClass(i);
//        Function<Integer, MyClass> k = 클래스이름::메서드이름;
        Function<Integer, MyClass> k = MyClass::new;

//        MyClass mc = s.get();   // MyClass 객체 반환
//        System.out.println(mc);
//        System.out.println(s.get());

//        MyClass mc = k.apply(100);
//        System.out.println(mc);
//        System.out.println(mc.iv);
        System.out.println(k.apply(200).iv);

//        Function<Integer, int[]> l = (i) -> new int[i];
//        Function<Integer, int[]> l = 클래스이름::메서드이름;
        Function<Integer, int[]> l = int[]::new;
        int[] arr = l.apply(100);
        System.out.println("arr.length=" + arr.length);

    }
}

class MyClass {
    int iv;

    MyClass(int iv) {
        this.iv = iv;
    }
}