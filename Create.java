class Create {

    public void login(String username) {
        System.out.println(username);
    }

    public void login(String username, int password) {
        System.out.println(username + " " + password);
    }

    public void login(String username, int password, int otp) {
        System.out.println(username + " " + password + " " + otp);
    }

    public static void main(String args[]) {
        Create c = new Create();

        c.login("Mahi");
        c.login("Mahi", 1234);
        c.login("Mahi", 1234, 196428);
    }
}