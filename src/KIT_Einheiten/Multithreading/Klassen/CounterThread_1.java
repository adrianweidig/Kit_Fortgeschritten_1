package KIT_Einheiten.Multithreading.Klassen;

/**
 * Klasse mit Runnable Funktionalität für simplen Counter
 *
 * @author Adrian Weidig
 * @since 24.03.2023
 */
public class CounterThread_1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("CounterThread 1 - " + i);

            // "Bremse"
            // for (long l = 0; l < 100000; l++);

            // Auch "Bremse"
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("CounterThread 1 beendet.");
    }
}
