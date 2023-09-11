package patterns.creational.factorymethod;

public class F16B extends F16 {

    @Override
    public F16 makeF16() {
        super.makeF16();
        engine = new F16Engine();
        return this;
    }
}
