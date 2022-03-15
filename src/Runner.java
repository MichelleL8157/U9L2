public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal("An Animal", 10);
        System.out.println(animal.getName());
        System.out.println(animal.getAge());
        animal.hungry();
        animal.mealsAte(3);

        Dog dog = new Dog("Pup", 3, false);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.isTookABath());
        dog.hungry();
        dog.mealsAte(5);
        dog.bark();

        Cat cat = new Cat("Kitten", 5, true);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.isLickedClean());
        cat.hungry();
        cat.mealsAte(1);
        cat.meow();
    }
}