public class OpearatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;

//        byte c = a + b; // 컴파일 에러가 발생한다. 명시적으로 형변환이 필요하다.
        // 그 이유는 byte + byte 는 int + int 로 캐스팅되어 연산되고 그 결과도 int 형인데,
        // int타입의 리터럴을 byte타입 변수에 저장할 수 없기 때문이다.

        byte c = (byte)(a + b);
        System.out.println(c);
    }
}
