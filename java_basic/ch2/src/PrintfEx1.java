public class PrintfEx1 {

    public static void main(String[] args) {
//        System.out.println(10/3);           // 정수/정수 이므로 결과가 정수로 출력된다.
//        System.out.println(10.0/3);         // 결과를 실수로 얻으려면 두 정수 중, 한쪽을 실수로 바꿔야 한다.
//        System.out.println(0x1A);           // println은 10진수로만 출력하기 떄문에 16진수 1A를 출력하면 26이 출력
//        System.out.printf("%s%n", Integer.toBinaryString(15));		// 1111 2진수
//        System.out.printf("%#o%n", 15);		//017
//        System.out.printf("%#x%n", 15);		// 0xf
//        System.out.printf("%#X%n", 15);		// 0XF

//        System.out.printf("%d%n", 15);      // 10진수
//        System.out.printf("%#o%n", 15);      // 8진수
//        System.out.printf("%#x%n", 15);      // 16진수
//        System.out.printf("%s%n", Integer.toBinaryString(15));      // 10진수를 2진수로

//        double f = 123.456789;
//        System.out.printf("%f%n", f);
//        System.out.printf("%e%n", f);
//        System.out.printf("%g%n", f);

        System.out.printf("[%5d]%n", 10);
        System.out.printf("[%-5d]%n", 10);
        System.out.printf("[%05d]%n", 10);

        System.out.printf("[%5d]%n", 1234567);  // 5자리를 지향했지만, 저장할 값이 7자리이기때문에  지정한 자리수와 상관없이 저장한 값을 모두 출력한다.

        double d = 1.23456789;
        System.out.printf("%f%n", d);
        System.out.printf("%14.10f%n", d);
        System.out.printf("%14.6f%n", d);
        System.out.printf("%.6f%n", d);       // 전체 자리수를 생략할 수도 있다.

        System.out.printf("[%s]%n", "www.codechobo.com");
        System.out.printf("[%20s]%n", "www.codechobo.com");
        System.out.printf("[%-20s]%n", "www.codechobo.com");
        System.out.printf("[%.10s]%n", "www.codechobo.com");




    }
}
