import java.util.Arrays;

public class Ex5_1 {

    public static void main(String[] args) {

//        int[]  score;           // 1. 배열 scoreㄹㄹ 선언(참조변수)
//        score = new int[5];     // 2. 배열의 생성(int 저장공간 * 5)

//        int[] score = new int[5];   // 배열의 선언과 생성을 동시에
//        score[3] = 100;
//        System.out.println("score[0]="+score[0]);
//        System.out.println("score[1]="+score[1]);
//        System.out.println("score[2]="+score[2]);
//        System.out.println("score[3]="+score[3]);
//        System.out.println("score[4]="+score[4]);
//
//        int value = score[3];
//        System.out.println("value="+value);

        int[] iArr1 = new int[10];
        int[] iArr2 = new int[10];
//        int[] iArr3 = new int[]{100, 95, 80, 70, 60};
        int [] iArr3 = {100, 95, 80, 70, 60};
        char[] chArr = {'a', 'b', 'c', 'd'};

        for (int i = 0; i < iArr1.length; i = i + 1) {
            iArr1[i] = i + 1;       // 1~10의 숫자를 순서대로 배열에 넣는다.
        }

        for (int i = 0; i < iArr2.length; i = i + 1) {
            iArr2[i] = (int)(Math.random()*10) + 1; // 1~10의 값을 배열에 저장
        }

        // 배열에 저장된 값들을 출력한다.
        for(int i = 0; i < iArr1.length; i = i + 1){
            System.out.print(iArr1[i]+",");
        }
        System.out.println();

//        for(int i = 0; i < iArr2.length; i = i + 1) {
//            System.out.print(iArr2[i] + ",");
//        }
//        System.out.println();
//
//        for(int i = 0; i < iArr3.length; i = i + 1) {
//            System.out.print(iArr3[i] + ",");
//        }
//        System.out.println();
//
//        for(int i = 0; i < chArr.length; i = i + 1) {
//            System.out.print(chArr[i] + ",");
//        }
//        System.out.println();

        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(iArr3));
        System.out.println(Arrays.toString(chArr));
        System.out.println(iArr1);
        System.out.println(iArr2    );
        System.out.println(iArr3);
        System.out.println(chArr);

    }
}