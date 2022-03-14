public class Ex2_12 {

    public static void main(String args[]){
        String str = "3";

        System.out.println(str.charAt(0) - '0');            // str에 문자열을 직접 써도 된다. 문자열3을 문자3으로 변환하고, 숫자로 변환
        System.out.println("3".charAt(0) - '0');            // str에 문자열을 직접 써도 된다. 문자열3을 문자3으로 변환하고, 숫자로 변환


        System.out.println('3' - '0' + 1);                  // 문자 3을 숫자로 바꾼후 +1
        System.out.println(Integer.parseInt("3") + 1);   // 문자열 3을 숫자로 3으로 바꾼후 + 1
        System.out.println("3" + 1);                        // 문자열 3에  + 1을 하면 1이 "1"로 바뀌어서 3과1이 같이 찍혀서 출력

        System.out.println(3 + '0');                        // '0'은 숫자로 48이다. 숫자3을 문자로 변환하는 문장인데,
                                                            // 숫자 3 + 문자'0'을 숫자로 바꾸고, 다시 그것을 char을 통해 형변환 해주는 방식임
                                                            // 그래서 이걸 그냥 출력하면 48+3 즉, 숫자 51이 출력됨
        System.out.println((char)(3+'0'));                  // 숫자 3을 문자 3으로 변환

    }
}
