/*import java.util.concurrent.Semaphore;

public class DiningPhilosophersWithTwoTables {
    static class Philosopher implements Runnable {

        Semaphore semaphore; // Светофор, ограничивающий число философов
        int mealNumber = 0;  // Количество приемов пищи
        String philosopherName;  // Имя философа
        Philosopher(Semaphore semaphore, String philosopherName)
        {
            this.semaphore = semaphore;
            this.philosopherName = philosopherName;
        }

        @Override
        public void run() {
            try {
                while (mealNumber < 3) {
                    // Запрашиваем разрешение на выполнение
                    semaphore.acquire();
                    System.out.println("Philosopher " + philosopherName + " seat at the table");
                    // Философ ест
                    Thread.sleep(500);
                    mealNumber++;
                    System.out.println("Philosopher " + philosopherName + " leaves the table");
                    semaphore.release();
                    Thread.sleep(500);
                }
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {

        String[] philosopherNames = {
                "Aristotle",
                "Plato",
                "Socrates",
                "Zeno of Elea",
                "Heraclitus"
        };

        Semaphore semaphore = new Semaphore(2);
        for (String name : philosopherNames){
            new Thread(new Philosopher(semaphore, name)).start();
        }
    }
}
*/