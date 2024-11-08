public class Dog {

    public String name;
    private String breed;
    protected int age;
    public static final String species = "Canine";


    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }


    public Dog() {
        this.name = "Unknown";
        this.breed = "Unknown";
        this.age = 0;
    }


    public String getBreed() {
        return breed;
    }


    protected void displayAnimalInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }


    public static void displaySpecies() {
        System.out.println("All dogs are of species: " + species);
    }
}

public class Cat {

    public String name;
    private String color;
    protected int age;
    public static final String species = "Feline";


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public Cat() {
        this.name = "Unknown";
        this.color = "Unknown";
        this.age = 0;
    }


    public String getColor() {
        return color;
    }


    protected void displayAnimalInfo() {
        System.out.println("Name: " + name + ", Color: " + color + ", Age: " + age);
    }


    public static void displaySpecies() {
        System.out.println("All cats are of species: " + species);
    }
}

public class main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Max", "Labrador", 5);
        Dog dog2 = new Dog();


        System.out.println("Dog 1:");
        dog1.displayAnimalInfo();
        System.out.println("Dog 2:");
        dog2.displayAnimalInfo();
        Dog.displaySpecies();


        Cat cat1 = new Cat("Whiskers", "Black", 3);
        Cat cat2 = new Cat();


        System.out.println("\nCat 1:");
        cat1.displayAnimalInfo();
        System.out.println("Cat 2:");
        cat2.displayAnimalInfo();
        Cat.displaySpecies();
    }
}
