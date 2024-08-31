package patterns.behavioral.observer.cod3r;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Porteiro {

    private final HashMap<String, ArrayList<Observer>> observadores = new HashMap<>();

    public void registrarObserver(String tipo, Observer observer) {
        this.observadores.putIfAbsent(tipo, new ArrayList<>());
        this.observadores.get(tipo).add(observer);
    }

    public void notificarObserver(String tipo) {
        ArrayList<Observer> observers = this.observadores.get(tipo);
        if (observers != null) {
            for (Observer observer : observers) {
                observer.eventoOcorreu();
            }
        }
    }

    void monitorando() {
        Scanner scanner = new Scanner(System.in);
        String evento = "";

        while (!evento.equals("sair")) {
            System.out.println("Porteiro: Monitorando...");
            System.out.println("Digite o tipo do evento (ou 'sair'): ");
            evento = scanner.nextLine();
            this.notificarObserver(evento);
        }
        scanner.close();
    }

}
