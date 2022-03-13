import java.util.*;     // 1. import문 추가

public class ScanfEx1 {

    public static void main(String[] args) {

        // 2. Scanner 클래스의 객체 생성
        Scanner scanner = new Scanner(System.in);

//        int num = scanner.nextInt();      // 1번 문장 = 2번문장 + 3번문장
//        int num2 = scanner.nextInt();
//
//        System.out.println(num);
//        System.out.println(num2);

        String input = scanner.nextLine();      // 2번 문장
        int num = Integer.parseInt(input);      // 3번 문장

        System.out.println(num);





    }
}
