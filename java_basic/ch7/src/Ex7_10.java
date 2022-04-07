public class Ex7_10 {
    public static void main(String[] args) {
//        Unit[] group = new Unit[3];
//        group[0] = new Marine();
//        group[1] = new Tank();
//        group[2] = new Dropship();
// 위의 네줄을 한줄로
        Unit[] group = {new Marine(), new Tank(), new Dropship()};

        for (int i = 0; i < group.length; i = i + 1)
            group[i].move(100, 200);
    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {/* 현재 위치에 정지 */}
}

class Marine extends Unit { // 보병
    void move(int x, int y) {
        System.out.println("Marine[x=" + x + ",y=" + y + "]");
    }
    void stimPack() {/* 스팀팩을 사용한다.*/}
}

class Tank extends Unit {   // 탱크
    void move(int x, int y) {
        System.out.println("Tank[x=" + x + ",y=" + y + "]");
    }
    void changeMode() {/* 공격모드를 변환한다. */}
}

class Dropship extends Unit {   // 수송선
    void move(int x, int y) {
        System.out.println("Dropship[x=" + x + ",y=" + y + "]");
    }
    void load_unload() {/* 병력을 태우고 내린다 */}
}