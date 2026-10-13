class Area {

    public void area(int s) {
        System.out.println(s * s + " Area of Square");
    }

    public void area(int l, int b) {
        System.out.println(l * b + " Area of Rectangle");
    }

    public void area(double r) {
        System.out.println(3.14 * r * r + " Area of Circle");
    }

    public static void main(String args[]) {
        Area a = new Area();

        a.area(10);
        a.area(20, 30);
        a.area(10.0);
    }
}