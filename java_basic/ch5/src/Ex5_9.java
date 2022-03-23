import java.util.*;

public class Ex5_9 {

    public static void main(String[] args) {
        int[][] score = {
                {100, 100, 100,},
                {20, 20, 20},
                {30, 30, 30},
                {40, 40, 40},
                {50, 50, 50}
        };
        // 과목별 총점
        int korTotal = 0, engTotal = 0, mathTotal = 0;

        System.out.println("번호 국어 영어 수학 총점 평균");
        System.out.println("==========================");

        for (int i = 0; i < score.length; i = i + 1) {
            int sum = 0;        // 개인별 총점
            float avg = 0.0f;   // 개인별 평균
            korTotal = korTotal + score[i][0];
            engTotal = engTotal + score[i][1];
            mathTotal = mathTotal + score[i][2];
            System.out.printf("%3d", i + 1);        // println이 아니라 printf여서 개행문자를 적어주지 않는 한, 다음줄로 넘어가지 않음
                for (int j = 0; j < score[i].length; j = j + 1) {
                    sum = sum+score[i][j];
                    avg = sum / (float)score[i].length;
                }
            System.out.println("  "+score[i][0]+"  "+score[i][1]+"  "+score[i][2]+"  "+sum+"  "+avg);
        }
        System.out.println("==========================");

        System.out.println("총점:"+korTotal+" "+engTotal+" "+mathTotal);
    }
}
