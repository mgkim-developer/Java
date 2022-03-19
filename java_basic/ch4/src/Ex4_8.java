public class Ex4_8 {

    public static void main(String[] args) {
        int i; // scope(범위) - 선언위치부터 선언된 블럭의 끝까지 유효
        for (i = 1; i <= 10; i++) { // 괄호{}안의 문장을 5번 반복
            System.out.println("i="+i);
        }

//        int i = 1; // scope(범위) - 선언위치부터 선언된 블럭의 끝까지

        // 조건식을 생략하면, true로 간주되어서 무한반복문이 됨
//        for (;;) {
//            System.out.println("i="+i);
//        }
//        System.out.println(i);




//        for (int i = 1, j = 10; i <= 10; i = i+1, j = j-1) {
//
//            // 괄호{}안의 문장을 번 반복
//            System.out.println("Hello");
//            System.out.println("i="+i+", j="+j);
//            }
        }
    }