package patterns.creational.factorymethod;

public class F16A extends F16 {

    public F16 makeF16() {
        super.makeF16();
        engine = new F16Engine();
        return this;
    }
}
