public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    // Ghi đè phương thức (đa hình)
    @Override
    public void makeSound() {
        System.out.println(name + " meows.");
    }
}
