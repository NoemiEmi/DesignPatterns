package comSdaCleancode.liskov.new_way;

public class DuckApp {
    public static void main(String[] args) {
        Duck duck = new DomesticDuck("Jane ");// Liskov's substitution principle
        duck.eat();
    }
}
