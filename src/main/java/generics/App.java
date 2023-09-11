package generics;

public class App {

    public static void main(String[] args) {

        GenericClass<Integer> integerGenericClass = new GenericClass<>();
        integerGenericClass.getT(   );

        GenericClass<String> stringGenericClass = new GenericClass<>();
        stringGenericClass.setT("Hello");
    }

}
