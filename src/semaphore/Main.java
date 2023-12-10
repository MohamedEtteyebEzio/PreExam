package semaphore;

import loock.Impaire;
import loock.Nombre;
import loock.Paire;

public class  Main {
    public static void main(String[] args) {
        loock.Nombre nombre = new Nombre();
        loock.Paire threadPaire = new Paire(nombre);
        loock.Impaire threadImpaire = new Impaire(nombre);

        threadPaire.setName("Thread Paire");
        threadImpaire.setName("Thread Impaire");

        threadPaire.start();
        threadImpaire.start();
    }
}