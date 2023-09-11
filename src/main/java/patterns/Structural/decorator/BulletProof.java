package patterns.Structural.decorator;

public class BulletProof implements IAircraft {

    IAircraft boeing;

    public BulletProof(IAircraft boeing) {
        this.boeing = boeing;
    }

    @Override
    public void fly() {
        boeing.fly();
    }

    @Override
    public void land() {
        boeing.land();
    }

    @Override
    public float getWeight() {
        return 50f + boeing.getWeight();
    }
}
