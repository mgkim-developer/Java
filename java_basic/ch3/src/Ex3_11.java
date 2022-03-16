public class Ex3_11 {
    public static void main(String argsp[]){
        double pi = 3.141592;

        System.out.println(pi);
        System.out.println(pi*1000);
        System.out.println(Math.round(pi*1000));
        System.out.println(Math.round(pi*1000) / 1000);              // 3
        System.out.println(Math.round(pi*1000) / 1000.0);            // 3.142
        System.out.println((double)Math.round(pi*1000) / 1000);      // 3.142

        // 3.141을 얻으려면?
        System.out.println((int)(pi*1000));
        System.out.println((int)(pi*1000) / 1000.0);                // 소수점 아래의 값을 잘라낼 때 형변환 연산자 사용





//        double shortPi = Math.round(pi*1000) / 1000.0;
//        System.out.println(shortPi);
    }
}
