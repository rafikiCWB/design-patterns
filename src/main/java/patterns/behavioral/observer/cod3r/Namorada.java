package patterns.behavioral.observer.cod3r;

public class Namorada implements Observer {
    @Override
    public void eventoOcorreu() {
        System.out.println("Namorada: Apagar as luzes...");
        System.out.println("Namorada: Fazer silêncio...");
        System.out.println("Namorada: Surpresinha!!!\n...");
    }
}
