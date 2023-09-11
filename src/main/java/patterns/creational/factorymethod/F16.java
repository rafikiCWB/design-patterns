package patterns.creational.factorymethod;

public class F16 {

    F16Engine engine;
    F16Cockpit cockpit;

    protected F16 makeF16() {
        engine = new F16Engine();
        cockpit = new F16Cockpit();
        return this;
    }

    public void taxi() {
        System.out.println("F16 is taxing on the runway! ");
    }

    public void fly() {
        // Note here carefully the superclass F16 doesn't know what type of F-16 variant it was returned.
        F16 f16 = makeF16();
        f16.taxi();
        System.out.println("F16 with bad design flying...");
    }

}
