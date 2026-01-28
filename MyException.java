//Q9. Create a custom exception that do not have any stack trace.

class MyException extends Exception {

    @Override
    public Throwable fillInStackTrace() {
        return this;   // disables stack trace
    }
}

class Test {
    public static void main(String[] args) {

        try {
            throw new MyException();
        } catch (MyException e) {
            e.printStackTrace();  // no stack trace shown
        }
    }
}
