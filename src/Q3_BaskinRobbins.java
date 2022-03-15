public class Q3_BaskinRobbins extends Q3_Store{
    private int iceCreamCount;

    public Q3_BaskinRobbins(String name, int employees, boolean isOpen, int iceCreamCount) {
        super(name, employees, isOpen);
        this.iceCreamCount = iceCreamCount;
    }

    public int getIceCreamCount() { return iceCreamCount; }

    public void melting() {
        System.out.println("The food is melting!");
    }
}
