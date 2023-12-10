package semaphore;

public class Paire extends  Thread{
    private Nombre n;
    public Paire(Nombre nombre) {
        this.n = nombre;
    }

    @Override
    public void run() {
        while (true) {
            n.incrementImpaire();
        }
    }



}
