/*import java.util.concurrent.Semaphore;

public class Philosophers_var2 implements Runnable {
        Semaphore semaphore;
    private String name;

        public String getName() {
            return name;
        }

        public Philosophers_var2(Semaphore semaphore, String name) {
            this.semaphore = semaphore;
            this.name = name;
        }
        public void think (Philosophers_var2 philosopher){
            System.out.println(philosopher.getName()+" has a thought and he is thinking about it");
        }

        public void eat (Philosophers_var2 philosopher){
            System.out.println(philosopher.getName()+" is having a dinner");
        }

        public void takeAFork (Philosophers_var2 philosopher, Philosophers_var2.Fork fork){
            System.out.println(name+" is taking a "+ fork.getName());
        }

        public void putAFork (String name, Philosophers_var2.Fork fork){
            System.out.println(name+" is laying down a "+ fork.getName());
        }
    @Override
    public void run() {
        System.out.println(this.name + " is hungry and waiting for a permit to eat");
        if (semaphore.availablePermits() > 1) {
            try {
                semaphore.acquire(2);
                System.out.println(this.name + " is taking right fork...");
                //semaphore.acquire();
                System.out.println(this.name + " is taking left fork...");
                System.out.println(name + " is eating");
                Thread.sleep(2000);
                System.out.println(name + " full and can think");
                System.out.println(this.name + " is laying down right fork...");
                semaphore.release();
                System.out.println(this.name + " is laying down left fork...");
                semaphore.release();
                System.out.println(name + " is thinking");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class Fork{
        public String getName() {
            return name;
        }

        private String name;

        public Fork(String name) {
            this.name = name;
        }
    }
}*/


