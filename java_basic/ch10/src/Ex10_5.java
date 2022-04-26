import java.util.Calendar;

class Ex10_5 {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage : java Ex10_5 2019 9");
            return;
        }
        int year = Integer.parseInt(args[0]);   // "2019" 가 2019
        int month = Integer.parseInt(args[1]);  // "9" 가 9
        int START_DAY_OF_WEEK = 0;  // 1일의 요일
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); // 시작일
        Calendar eDay = Calendar.getInstance(); // 끝 일

        //  월의 경우 0부터 11까지의 값을 가지므로 1을 뺴주어야 한다.
        //  예를 들어, 2019년 11월 1일은 sDay.set(2019, 10, 1); 과 같이 해준다.
        sDay.set(year, month-1, 1); // month는 0부터 시작
        eDay.set(year, month, 1);

        // 다음달의 첫날(12월 1일에서 하루를 빼면 현재달의 마지막 날 (11월 30일)이다.
        // 매 달마다 끝나는 일이 다르기 떄문에, 어떤 달의 마지막날을 구하기 위해서는 구하고자하는 달의 다음달의 1일에서 하루를 뺴준다.
        eDay.add(Calendar.DATE, -1);

        // 첫 번째 요일이 무슨 요일인지 알아낸다. 1일이 무슨 요일인지 알아낸다.
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        // eDay에 지정된 날짜를 얻어온다.
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("      " + year + "년 " + month + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 1일이 어느 요일인지에 따라서 공백을 출력한다.
        // 만일 1일이 수요일이라면 공백을 세 번 찍는다 (일요일 부터 시작)
        for (int i = 1; i < START_DAY_OF_WEEK; i = i + 1)
            System.out.print("   ");

        for (int i = 1, n=START_DAY_OF_WEEK; i <= END_DAY; i = i + 1, n = n + 1) {
            System.out.print((i < 10)? "  "+i : " "+i);
            if (n%7==0) System.out.println();   // n이 7이 될 때마다 줄바꿈
        }
    }
}
