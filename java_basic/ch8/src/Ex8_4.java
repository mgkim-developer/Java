class Ex8_4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
//            System.out.println(0/0);    // ArithmeticException
            System.out.println(args[0]);    //ArrayIndexOutOfBoundsException
            System.out.println(4);
        }
        catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException)
                System.out.println("true");
            System.out.println("ArithmeticException");
        }
        catch(ArrayIndexOutOfBoundsException aie) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }   // try-catch의 끝

        System.out.println(6);
    }
}
