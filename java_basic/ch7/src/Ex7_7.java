class Ex7_7 {
    public static void main(String[] args) {
        // -------------Case 1---------------
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;       // car = (Car)fe; 에서 형변환이 생략됨
//        car.water();  // car 타입의 참조변수로는 water()호출 불가
        fe2 = (FireEngine)car;  // 자손타입  ← 조상타입. 형변환 생략 불가
        fe2.water();

        // -------------Case 2---------------
//        Car car = null;
//        FireEngine fe = new FireEngine();
//
//        // 조상 → 자손으로 형변환 or 자손 → 조상으로 형변환 해도 상관없으나, 실제로 가리키는 객체가 무엇인지가 중요함.
//        FireEngine fe2 = (FireEngine)car;   // 조상 → 자손으로 형변환     car가 null이므로 객체가 없음 . 따라서 fe2도 null이 저장
//        Car car2 = (Car)fe2;                // 자손 → 조상으로 형변환
////        car2.drive();   // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Car.drive()" because "car2" is null  에러 발생
//        // car, fe2, car2는 null임

        // -------------Case 3---------------
//        Car c = new Car();
//        FireEngine fe = (FireEngine)c;  // java.lang.ClassCastException : class Car cannot be cast to class FireEngine
//        fe.water();

    }
}

class Car{
    String color;
    int door;

    void drive() {  // 운전하는 기능
        System.out.println("drive, Brrr~");
    }

    void stop() {   // 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {  // 소방차
    void water() {  // 물을 뿌리는 기능
        System.out.println("water!!!!");
    }
}
