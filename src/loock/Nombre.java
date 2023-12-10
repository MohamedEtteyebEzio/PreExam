package loock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Nombre {
    private Lock verrou = new ReentrantLock();
    private int count = 0; // Initialisation à 1

    public void incrementerPaire() {
        while (count < 100) {
            verrou.lock();
            try {
                if (count % 2 == 0 ) {
                    System.out.println("Paire : " + count);
                    count++;
                }
            } finally {
                verrou.unlock();
            }
        }
    }

    public void incrementerImpaire() {
        while (count < 100) {
            verrou.lock();
            try {
                if (count % 2 != 0) {
                    System.out.println("Impaire : " + count);
                    count++;
                }
            } finally {
                verrou.unlock();
            }
        }
    }
}


