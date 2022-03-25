public class Ex6_4 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        long result5 = mm.max(5L, 3L);    // 둘 중에 큰 값을 반환하는 메서드
        mm.printGugudan(2);    //  구구단 12단을 출력

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
        System.out.println("max(5, 3) = " + result5);


    }
}


// 사칙연산 메서드를 가지고 있는 MyMath클래스
class MyMath{
    long add(long a, long b) {
        long result = a + b;
        return result;}
//        return a + b;   // 위의 두줄을 이와 같이 한 줄로 간단히 할 수 있다.}
    long subtract(long a, long b) {return a - b;}
    long multiply(long a, long b) {return a * b;}
    double divide(double a, double b) {return a/ b;}
    // 두 값을 받아서 둘중에 큰 값을 반환하는 메서드를 작성하시오.
    long max(long a, long b) {
        if (a>b) {
            return a;   // 조건식이 참일때만 실행
        } else{
            return b;   // 조건식이 거짓일 때 실행
        }
//        return a > b ? a : b; // 위 문장을 삼항 연산자를 이용해서 작성
        }
    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9))
            return;     //입력받은 단(dan)이 2~9가 아니면, 메서드 종료하고 돌아가기
        for (int i = 1; i <= 9; i = i + 1){
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
        return; // 메서드의 반환값이 return값이 void이므로 생략 가능
    }
}