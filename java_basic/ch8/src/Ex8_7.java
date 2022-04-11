class Ex8_7 {
    public static void main(String[] args) {
        // Exception과 그 자손은 반드시 예외처리를 해줘야 한다. (필수)
        try {throw new Exception();
        }
        catch(Exception e) {
        }

        // RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일이 된다. (선택)
        throw new RuntimeException();
    }
}
// checked 예외 - 예외처리가 필수