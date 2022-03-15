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

        Q3_Store store = new Q3_Store("Cool Store", 5, true);
        System.out.println(store.getName());
        System.out.println(store.getEmployees());
        System.out.println(store.isIsOpen());
        store.attract();

        Q3_IceCream store1 = new Q3_IceCream("Baskin Robbins", 2, false, 31);
        System.out.println(store1.getName());
        System.out.println(store1.getEmployees());
        System.out.println(store1.isIsOpen());
        System.out.println(store1.getIceCreamCount());
        store1.attract();
        store1.melting();

        Q3_Chicken store2 = new Q3_Chicken("KFC", 4, true, 5);
        System.out.println(store2.getName());
        System.out.println(store2.getEmployees());
        System.out.println(store2.isIsOpen());
        System.out.println(store2.getChickenCount());
        store2.attract();
        store2.steaming();
    }
}