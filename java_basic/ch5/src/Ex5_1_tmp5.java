import java.util.Arrays;
import static java.util.Arrays.copyOf;

public class Ex5_1_tmp5 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};    // 1차원 배열 arr
        int[][] arr2D = {{11, 12}, {21, 22}};   // 2ckdnjs qoduf

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(str2D==str2D2);  // 참조변수값을 비교하는 것이다. 즉, 두 배열의 값이 같은지 확인하려면 이렇게 하면 안된다.
        System.out.println(Arrays.deepEquals(str2D, str2D2));   // 2차원 두배열의 값이 같은지 확인

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 ={2, 1, 4 ,3, 5};
        System.out.println(Arrays.toString(arr4));  // 정렬 전
        Arrays.sort(arr4);                          // 배열 arr을 오름차순으로 정렬
        System.out.println(Arrays.toString(arr4));  // 정렬 후
    }
}
