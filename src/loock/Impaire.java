package loock;
public class Impaire extends Thread {
    private Nombre nombre;

    public Impaire(Nombre nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        while (true) {
            nombre.incrementerImpaire();
        }
    }
}
