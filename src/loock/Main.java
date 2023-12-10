package loock;

public class  Main {
    public static void main(String[] args) {
        Nombre nombre = new Nombre();
        Paire threadPaire = new Paire(nombre);
        Impaire threadImpaire = new Impaire(nombre);

        threadPaire.setName("Thread Paire");
        threadImpaire.setName("Thread Impaire");

        threadPaire.start();
        threadImpaire.start();
    }
}
