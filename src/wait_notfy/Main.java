package wait_notfy;

public class Main {
    static int count = 0;

    public static void main(String[] args) {
        Impaire impaire = new Impaire(); // Utilisation de la classe Impaire
        Pair paire = new Pair(count); // Utilisation de la classe Paire

        impaire.setName("Thread Impaire");
        paire.setName("Thread Paire");
        paire.start();
        impaire.start();
    }
}