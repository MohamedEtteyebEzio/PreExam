package wait_notfy;

public class Pair extends  Thread{
    static int count;  // Utilisation d'une variable statique partagée


    public Pair(int count){
        this.count=count;
    }

    synchronized void increment(){
        while (count < 100 ) {
            count++;
          //  if (count>0)
            System.out.println(Thread.currentThread().getName()+" : "+count);
        }
        notify();
        while (count%2!=0){
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


