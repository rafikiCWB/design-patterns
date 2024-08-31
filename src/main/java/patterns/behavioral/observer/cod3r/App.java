package patterns.behavioral.observer.cod3r;

public class App {
    public static void main(String[] args) {
//        Monitorando notificar = new Monitorando();
        // Obersavores
        var  namorada = new Namorada();
        var sindico = new Sindico();

        // Subjects
        var porteiro = new Porteiro();

        porteiro.registrarObserver("chegada-rafinha", namorada);
        porteiro.registrarObserver("chegada-rafinha", sindico);

        // Monitorando...
        porteiro.monitorando();
    }
}
