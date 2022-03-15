public class Q3_Store {
    private String name;
    private int employees;
    private boolean isOpen;

    public Q3_Store(String name, int employees, boolean isOpen) {
        this.name = name;
        this.employees = employees;
        this.isOpen = isOpen;
    }

    public String getName() { return name; }
    public int getEmployees() { return employees; }
    public boolean isIsOpen() { return isOpen; }

    public void attract() {
        System.out.println("Our food is the best!");
    }
}
