public class VarEx2 {
    public static void main(String[] args){
        // println 은 줄바꿈을 해서 출력
//        System.out.println("Hello");
//        System.out.println("Hello");
//        System.out.println("Hello");

        // print 는 줄바꿈 없이 출력
//        System.out.print("Hello");
//        System.out.print("Hello");
//        System.out.print("Hello");

//        System.out.println(5+3);    // 덧셈
//        System.out.println(5-3);    // 뺼셈
//        System.out.println(5*3);    // 곱셈
//        System.out.println(5/3);    // 나눗셈
//        System.out.println(5/3.0);

        int x = 4, y = 2;
        int tmp;

        tmp = x;        // 1. x의 값을 tmp에 저장
        x = y;          // 2. y의 값을 x에 저장
        y = tmp;        // 3. tmp의 값을 y에 저장
        System.out.println("x="+x);     // '+'는 숫자 앞에 글자를 붙일 때도 사용
        System.out.println("y="+y);




    }
}