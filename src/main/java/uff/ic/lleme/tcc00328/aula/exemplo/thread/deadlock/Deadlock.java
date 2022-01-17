package uff.ic.lleme.tcc00328.aula.exemplo.thread.deadlock;

public class Deadlock {

    public static void main(String[] args) {
        final Friend alphonse = new Friend("Alphonse");
        final Friend gaston = new Friend("Gaston");

        Runnable r1 = new Runnable() {
            public void run() {
                alphonse.bow(gaston);
            }
        };
        new Thread(r1).start();

        new Thread(new Runnable() {
            public void run() {
                gaston.bow(alphonse);
            }
        }).start();
    }
}
