import java.util.concurrent.Semaphore;

public class DinningPhilosophersWithFiveForks {

    public static class Fork {
        int amountOfForks=5;
    }

    static class Philosophers implements Runnable {
        Fork forks;
        Semaphore semaphore;
        String name;

        public Philosophers(Fork forks, Semaphore semaphore, String name) {
            this.forks = forks;
            this.semaphore = semaphore;
            this.name = name;
        }

        @Override
        public void run() {
            //forks.amountOfForks = 5;
            System.out.println(this.name + " is hungry and waiting for a permit to eat");
            //if (forks.amountOfForks > 1) {
                try {
                    semaphore.acquire(2);
                    System.out.println(this.name + " is taking right fork...");
                    //forks.amountOfForks--;
                    System.out.println(this.name + " is taking left fork...");
                    //forks.amountOfForks--;
                    System.out.println(name + " is eating");
                    Thread.sleep(2000);
                    System.out.println(name + " is full and can think");
                    System.out.println(this.name + " is laying down right fork...");
                    //forks.amountOfForks++;
                    semaphore.release();
                    System.out.println(this.name + " is laying down left fork...");
                    //forks.amountOfForks++;
                    semaphore.release();
                    System.out.println(name + " is thinking");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            //} else {
                //System.out.println(this.name + " keeps thinking and waiting for permit to eat");
            }
        }
    //}

    public static void main(String[] args) {

        String[] names = {
                "Aristotle",
                "Diogenes",
                "Plato",
                "Socrates",
                "Pythagoras"
        };

        Semaphore semaphore = new Semaphore(5);
        Fork forks = new Fork();

        for (String name : names) {
            new Thread(new DinningPhilosophersWithFiveForks.Philosophers(forks, semaphore, name)).start();
        }
    }
}
