package semaphore;

import java.util.concurrent.Semaphore;

public class Nombre {
    private Semaphore s;
    private int count =1;


    public Nombre() {
        this.s = new Semaphore(1,true);
    }

    public void incrementPaire(){
        while (count < 100) {

            try {
                s.acquire();
                if (count % 2 == 0 ) {
                    System.out.println("Paire : " + count);
                    count++;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                s.release();
            }
        }
    }


    public void incrementImpaire(){
        while (count < 100) {

            try {
                s.acquire();
                if (count % 2 != 0 ) {
                    System.out.println("Impaire : " + count);
                    count++;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                s.release();
            }
        }
    }



}
