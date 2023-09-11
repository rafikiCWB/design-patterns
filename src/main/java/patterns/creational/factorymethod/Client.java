package patterns.creational.factorymethod;

import java.util.Collection;
import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {

        Collection<F16> myAirForce = new ArrayList<F16>();
        F16 f16A = new F16A();
        F16 f16B = new F16B();
        myAirForce.add(f16A);
        myAirForce.add(f16B);

        for (F16 f16 : myAirForce) {
            f16.fly();
        }

//        // we instantiate from a concrete class, thus typing ourselves to it
//        F16 f16 = new F16();
//        f16.fly();
    }
}
