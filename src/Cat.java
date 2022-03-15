public class Cat extends Animal {
    private boolean lickedClean;

    public Cat(String name, int age, boolean lickedClean) {
        super(name, age);
        this.lickedClean = lickedClean;
    }

    public boolean isLickedClean() {
        return lickedClean;
    }

    public void meow() {
        System.out.println("Meow...");
    }
}
