public class Q3_Chicken extends Q3_Store{
    private int chickenCount;

    public Q3_Chicken(String name, int employees, boolean isOpen, int chickenCount) {
        super(name, employees, isOpen);
        this.chickenCount = chickenCount;
    }

    public int getChickenCount() { return chickenCount; }

    public void steaming() {
        System.out.println("The food is steaming hot!");
    }
}
