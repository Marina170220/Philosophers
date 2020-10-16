//Есть пять философов, но одновременно за столом могут сидеть не более двух.
//Необходимо, чтобы все философы пообедали, но при этом не возникло взаимоблокировки философами друг друга в борьбе за место за столом.
//


import java.util.concurrent.Semaphore;

public class MyClass {

    static class Philosopher implements Runnable {
        Semaphore semaphore;
        String name;

        public Philosopher(Semaphore semaphore, String name) {
            this.semaphore = semaphore;
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(this.name + " is waiting for a permit");
            try {
                semaphore.acquire();
                System.out.println(name + " is having a dinner");
                Thread.sleep(2000);
                System.out.println(name + " get enough food and is leaving the table");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            semaphore.release();
        }

        public static void main(String[] args) {
            Semaphore semaphore = new Semaphore(2);
            new Thread(new Philosopher(semaphore, "first philosopher")).start();
            new Thread(new Philosopher(semaphore, "second philosopher")).start();
            new Thread(new Philosopher(semaphore, "third philosopher")).start();
            new Thread(new Philosopher(semaphore, "forth philosopher")).start();
            new Thread(new Philosopher(semaphore, "fifth philosopher")).start();
        }
    }
}
