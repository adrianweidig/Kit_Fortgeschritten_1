package KIT_Einheiten.Multithreading.Klassen;

public class CounterThread_2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.err.println("CounterThread 2 - " + i);
        }

        System.err.println("CounterThread 2 beendet.");
    }
}
