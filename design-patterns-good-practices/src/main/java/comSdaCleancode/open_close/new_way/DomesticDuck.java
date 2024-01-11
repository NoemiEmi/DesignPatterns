package comSdaCleancode.open_close.new_way;

public class DomesticDuck extends Duck {
    public DomesticDuck(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Domestic duck: "+ getName()+" is eating!");
    }
}


