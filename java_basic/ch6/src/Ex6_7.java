class Data2 {int x;}

public class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();  // Data2 객체 생성
        d.x = 10;   // Data2클래스 객체 d의 x에 10을 저장
        System.out.println("main() : x = " + d.x);  // Data2클래스 객체 d에 저장되어 있는 x값 10출력

        change(d);  // change 메서드 호출
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }
    static void change(Data2 d) {// 참조형 매개변수
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}