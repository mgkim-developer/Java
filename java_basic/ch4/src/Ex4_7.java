public class Ex4_7 {

    public static void main(String[] args) {
        int num = 0;

        // 괄호{} 안의 내용을 20번 반복한다.

        // Quiz1. 1~10사이의 난수를 20개 출력하시오
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
//        for (int i = 1; i <= 20; i++) {
//            System.out.println(Math.random());   // 0.0 <= x < 1.0
//            System.out.println(Math.random()*10);   // 0.0 <= x < 10.0
//            System.out.println((int)(Math.random()*10));   // 0 <= x < 10, 0~9
//            System.out.println((int)(Math.random()*10)+1);   // 1 <= x < 11, 1~10


        //Quiz2. -5~5사이의 난수를 20개 출력하시오
        // -5, -4, -3, -2, -1, 0, 1 ,2 ,3 ,4, 5
        for (int i = 1; i <= 20; i++) {
//            System.out.println(Math.random());  // 0.0 <= x < 1.0
//            System.out.println(Math.random()*11);  // 0.0 <= x < 11.0
//            System.out.println((int)(Math.random()*11));  // 0 <= x < 11
            System.out.println((int)(Math.random()*11)-5);  // -5 <= x < 6


        }
    }
}