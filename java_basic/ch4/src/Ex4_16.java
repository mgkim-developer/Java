public class Ex4_16 {

    public static void main(String[] args){
        int sum = 0;
        int i = 0;

        while(true) {
            if(sum > 100)
                break;
            i = i+1;
            sum = sum + i;
        } // end of while
        System.out.println("i=" + i);
        System.out.println("sum=" + sum);
    }
}