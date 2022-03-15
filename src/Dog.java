public class Dog extends Animal {
    private boolean tookABath;

    public Dog(String name, int age, boolean tookABath) {
        super(name, age);
        this.tookABath = tookABath;
    }

    public boolean isTookABath() {
        return tookABath;
    }

    public void bark() {
        System.out.println("Woof Woof!");
    }
}
