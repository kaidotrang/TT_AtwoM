public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Ghi đè phương thức (đa hình)
    @Override
    public void makeSound() {
        System.out.println(name + " barks.");
    }
}
