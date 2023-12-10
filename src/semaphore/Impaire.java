package semaphore;

public class Impaire extends Thread {
    private Nombre n;
    public Impaire(Nombre nombre) {
        this.n = nombre;
    }

    @Override
    public void run() {
        while (true) {
            n.incrementImpaire();
        }
    }

}
