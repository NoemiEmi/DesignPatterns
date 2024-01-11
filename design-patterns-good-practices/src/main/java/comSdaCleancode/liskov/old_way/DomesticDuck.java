package comSdaCleancode.liskov.old_way;

public class DomesticDuck extends Duck{

    public DomesticDuck(String name) {
        super(name);
    }
    public void eat(){
// breaking the principle
            if (getName().equals("Joe")) {
                throw new RuntimeException();
            } else {
                System.out.println("Domestic duck:"+getName()+" is eating!");
            }
    }
}
