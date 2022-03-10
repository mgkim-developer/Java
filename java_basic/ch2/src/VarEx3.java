public class VarEx3 {
    public static void main(String[] args){

        int score = 100;
        score = 200;

//        final int score = 100;        // 상수형 변수에 다른 값을 할당 하려하면 에러가 발생
//        score = 200;

//        final int score;              // 지역변수인 score를 초기화 하지않고 출력하려하면 에러가 발생

        boolean power = true;
//        boolean power = false;

        byte b = 127;   // byte타입변수의 범위는 -128~127

        int oct = 010;      // 접두사 0이 붙었으므로 8진수이고, 10진수로는 8이다.
        int hex = 0x10;     // 접두사 0x가 붙었으므로 16진수고, 10진수로는 16이다.

        long l = 1000_000_000;
        long l2 = 10_000_000_000L;

        float f = 3.14f;    // f는 생략가능
        double d = 3.14;    // d는 생략할 수 없음 (생략하면 에러발생)
        double d2 = 3.14f;  // 변수의 타입인 double이 리터럴의 타입float보다 더 넓은 타입이기 때문에 OK

        char ch = 'A';
        int i = 'A';        // 문자 'A'의 integer코드(65)가 저장된다

        String str = "";
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;

//        System.out.println(score);
//        System.out.println(power);
//        System.out.println(10.);
//        System.out.println(.10);    // println메소드는 값을 10진수로만 출력한다. 만약에 8진수나 16진수로 출력하려면 println대신 printf 사용
//        System.out.println(10f);
//        System.out.println(1e3);

        System.out.println(ch);
        System.out.println(i);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str4);
        System.out.println("" + 7 + 7);
        System.out.println(7 + 7 + "");




    }
}