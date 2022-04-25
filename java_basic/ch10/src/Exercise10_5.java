import java.util.Calendar;

class Exercise10_5 {
    static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
        int diff = 0;
        try {
            int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
            int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6)) - 1;
            int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));
            int year2 = Integer.parseInt(yyyymmdd1.substring(0, 4));
            int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6)) - 1;
            int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8));
            Calendar date1 = Calendar.getInstance();
            Calendar date2 = Calendar.getInstance();
//            System.out.println("date1="+date1);
//            System.out.println("date2="+date2);

            date1.clear();
            date2.clear();

//            System.out.println("date1="+date1);
//            System.out.println("date2="+date2);

            date1.set(year1, month1, day1);
            date2.set(year2, month2, day2);
//            System.out.println((date1.getTimeInMillis() - date2.getTimeInMillis()));
            diff = (int) ((date1.getTimeInMillis() - date2.getTimeInMillis()) / (24 * 60 * 60 * 1000)); // 밀리세컨드를 일단위로 나오게 하기 위해 (24 * 60 * 60 * 1000)으로 나눠줌.
        }
        catch (Exception e) {
            diff = 0;   // substring(), parseInt()에서 예외가 발생하면 0을 반환한다.
        }
        return diff;
    }

    public static void main(String[] args) {
        System.out.println(getDayDiff("20010103", "20010101")); // 2
        System.out.println(getDayDiff("20010103", "20010103")); // 0
        System.out.println(getDayDiff("20010103", "200103"));  // 0
    }
}