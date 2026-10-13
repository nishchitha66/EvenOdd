class Bill {

    public void price(int quantity, int billPrice) {
        int billGeneration = quantity * billPrice;
        System.out.println(billGeneration);
    }

    public void price(double quantity, double billPrice) {
        double billGeneration = quantity * billPrice;
        System.out.println(billGeneration);
    }

    public static void main(String args[]) {
        Bill b = new Bill();

        b.price(10, 20);
        b.price(10.2, 20.4);
    }
}