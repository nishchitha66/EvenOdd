class Maximum {

    public void max(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public void max(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static void main(String args[]) {
        Maximum m = new Maximum();

        m.max(2, 3);
        m.max(3, 4, 5);
    }
}