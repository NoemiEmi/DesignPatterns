package comSdaCleancode.liskov2;

public class Triangle {

    private int line1 = 2;
    private int line2 = 2;
    private int line3 = 6;

    public Triangle(int line1, int line2, int line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }
    //metoda:
    public void draw(){
        System.out.println("Drawing triangle with line 1,2 and 3: " + "line1 = " + line1 + "line2 = " + line2 + "line3 = " + line3);
    }
}
