class MyPoint extends Object{
    int x;
    int y;
}

//class Circle extends MyPoint{   // 상속
//    int r;
//}

class Circle extends Object{  // 포함
    MyPoint p = new MyPoint();
    int r;

    Circle() {
      p = new MyPoint();
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString());   // Circle@7a81197d
        System.out.println(c);   // Circle@7a81197d

        Circle c2 = new Circle();
        System.out.println(c2.toString());   // Circle@5ca881b5
        System.out.println(c2);   // Circle@5ca881b5


    }
}
