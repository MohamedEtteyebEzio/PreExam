package wait_notfy;

public class Impaire extends Thread {


    public Impaire() {
    }

    synchronized void increment() {
        while (Pair.count < 100) {
            Pair.count++;
            //if (Pair.count>0)
                System.out.println(Thread.currentThread().getName() + " : " + Pair.count);
        }

        notify(); // Note : Cela doit être placé à l'extérieur de la boucle
        while (Pair.count % 2 == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void run() {
        increment();
    }
}