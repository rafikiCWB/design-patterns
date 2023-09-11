package patterns.Structural.decorator;

public class Client {
    public static void main(String[] args) {
        IAircraft simpleBoeing = new Boeing747();
        IAircraft luxuryFittings = new LuxuryFittings(simpleBoeing);
        IAircraft bulletProofBoeing = new BulletProof(luxuryFittings);
        float netWeight = bulletProofBoeing.getWeight();
        System.out.println("Final weight of the plane: " + netWeight);

    }
}
