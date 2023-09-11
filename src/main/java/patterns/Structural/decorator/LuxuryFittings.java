package patterns.Structural.decorator;

public class LuxuryFittings implements IAircraft {

    IAircraft boeing;

    public LuxuryFittings(IAircraft boeing) {
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
        return (30.5f + boeing.getWeight());
    }
}
