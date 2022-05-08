//                 0     1     2      3
enum Direction { EAST, SOUTH, WEST, NORTH }

class Ex12_5 {
    public static void main(String[] args) {
        // 열거형 상수를 저장하는 방법 3가지
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST");

        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);

        System.out.println("d1==d2 ? "+ (d1==d2));  // false    열거형 상수는 객체라서 equals 혹은 compareTo를 사용해야하는데 등가비교 연산자도 가능하다는 특징이 있다.
        System.out.println("d1==d3 ? "+ (d1==d3));  // true
        System.out.println("d1.equals(d3) ? "+ d1.equals(d3));
//		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러 열거형상수는 객체라서 비교연산자 사용 불가
        System.out.println("d1.compareTo(d3) ? "+ (d1.compareTo(d3)));
        System.out.println("d1.compareTo(d2) ? "+ (d1.compareTo(d2)));

        switch(d1) {
            case EAST: // Direction.EAST라고 쓸 수 없다.(문법임)
                System.out.println("The direction is EAST."); break;
            case SOUTH:
                System.out.println("The direction is SOUTH."); break;
            case WEST:
                System.out.println("The direction is WEST."); break;
            case NORTH:
                System.out.println("The direction is NORTH."); break;
            default:
                System.out.println("Invalid direction."); break;
        }

        Direction[] dArr = Direction.values();  // 열거형의 모든 상수를 배열로 반환

        for(Direction d : dArr)  // for(Direction d : Direction.values())
            System.out.printf("%s=%d%n", d.name(), d.ordinal());    // ordinal은 값이 아니라 순서를 반환하는 것임
    }
}