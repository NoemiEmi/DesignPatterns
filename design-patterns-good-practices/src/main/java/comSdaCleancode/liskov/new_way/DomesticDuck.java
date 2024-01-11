package comSdaCleancode.liskov.new_way;

public class DomesticDuck extends Duck {

    public DomesticDuck(String name) {
        super(name);
    }

    public void eat() {
        //breaking the principle
        if (getName().equals("Joe")) {
            super.eat(); //call the functionality from parent
        } else {
            System.out.println("Domestic duck:" + getName() + " is eating!");
        }
    }
}

