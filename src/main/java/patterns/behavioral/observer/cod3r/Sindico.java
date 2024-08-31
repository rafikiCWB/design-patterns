package patterns.behavioral.observer.cod3r;

public class Sindico implements Observer {
    @Override
    public void eventoOcorreu() {
        System.out.println("Sindico: Verifica o barulho...");
        System.out.println("Sindico: Verifica se tem muita bagunça...");
        System.out.println("Sindico: Chamar a polícia\n...");
    }
}
