import java.util.Arrays;

public class Ex5_4 {

    public static void main(String[] args) {
        // 첫번쨰 요소랑만 만 바꾸는 코드
        int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < 100; i = i + 1) {
            int n = (int)(Math.random() * 10);      // 0~9중의 한 값을 임의로 얻는다.
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr));

        // i번째 요소랑 바꾸는 코드
        int[] numArr2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(numArr));

        for (int i = 0; i < numArr.length; i = i + 1) {
            int n = (int)(Math.random() * 10);      // 0~9중의 한 값을 임의로 얻는다.
            int tmp = numArr2[i];
            numArr2[i] = numArr2[n];
            numArr2[n] = tmp;
        }
        System.out.println(Arrays.toString(numArr2));
    }// main의 끝
}