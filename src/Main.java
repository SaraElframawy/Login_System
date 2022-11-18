public class Main {
    public static void main(String[] args) {
        IDAndPasscode idAndPasscode = new IDAndPasscode();

        LogIn logIn = new LogIn(idAndPasscode.getLoginInfo());
    }
}
