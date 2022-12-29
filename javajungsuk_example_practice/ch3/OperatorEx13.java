public class OperatorEx13 {
    public static void main(String[] args) {
        char c1 = 'a';

//        char c2 = c1 + 1;   // 라인 5: 컴파일 에러발생!!
        char c2 = 'a' + 1;   // 라인 6 : 컴파일 에러없음
        // -> 리터럴 간의 연산이므로 컴파일 시에 컴파일러가 계산해서
        // 그 결과를 대체 함으로써 코드를 보다 효율적으로 만든다.(실행시에는 덧셈 연산이 수행되지 않는다. 그저 덧셈연산결과인 문지'b'를 변수 c2에 저장할 뿐이다.)

        System.out.println(c2);

    }
}
