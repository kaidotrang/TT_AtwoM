public class App {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Kitty");
        System.out.println(myDog.name);
        System.out.println(myCat.name);
        // Đa hình: cùng một phương thức nhưng hành vi khác nhau
        myDog.makeSound();
        myCat.makeSound();
    }
}
