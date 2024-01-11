package comSdaCleancode.liskov.old_way;

public class DuckApp {
    public static void main(String[] args) {
        Duck duck = new DomesticDuck("Joe"); // Liskov's substitution principle
        duck.eat();
    }
}
