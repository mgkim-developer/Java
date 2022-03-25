public class Ex6_3 {
    public static void main(String[] args){
        System.out.println("Card.width = " + Card.width);   // cv는 객체생성 하지 않고 사용 가능
        System.out.println("Card.height = " + Card.height); // cv는 객생성성 하지 않고 사용 가능

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ("+Card.width+", "+Card.height+")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 ("+Card.width+", "+Card.height+")");

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");

        c1.width = 50;          // 참조변수로 넓이를 변경하기 때문에 iv를 변경하는 것 같지만 실제로는 cv를 변경하는 것이다.
        c1.height = 80;         // 참조변수로 넓이를 변경하기 때문에 iv를 변경하는 것 같지만 실제로는 cv를 변경하는 것이다.
//        Card.width = 50;      // 이렇게 수정해주어야 좋은 코드이다.
//        Card.height = 80;     // 이렇게 수정해주어야 좋은 코드이다.

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 ("+Card.width+", "+Card.height+")");
        System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 ("+Card.width+", "+Card.height+")");
    }
}

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}