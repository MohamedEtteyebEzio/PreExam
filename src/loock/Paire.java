package loock;

public class Paire extends Thread {
    private Nombre nombre;

    public Paire(Nombre nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (true) {
            nombre.incrementerPaire();
        }
    }
}
