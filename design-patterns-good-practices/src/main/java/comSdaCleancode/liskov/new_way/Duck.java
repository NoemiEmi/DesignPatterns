package comSdaCleancode.liskov.new_way;

public class Duck {
    private String name; // you can make this protected or better create a getter

    public Duck(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Duck "+name+" is eating!");
    }

    public String getName() {
        return name;
    }
}
