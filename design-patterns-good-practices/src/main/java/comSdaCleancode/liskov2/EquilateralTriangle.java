package comSdaCleancode.liskov2;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(int line1) {
        super(line1, line1, line1);
    }

    @Override
    public void draw() {
        throw new RuntimeException();

    }
}
