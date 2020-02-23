package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {
        UpperLimitedPositiveCounter cnt = new UpperLimitedPositiveCounter(1, 10);
        //erreur initialisation
        // UpperLimitedPositiveCounter cnt = new UpperLimitedPositiveCounter(10, 1);
        cnt.inc();
        cnt.inc();
        cnt.inc();
        //erreur upperLimite
        //  cnt.add(7);
        cnt.add(6);
        //erreur limite incrémentation
        //   cnt.inc();
        System.out.println(cnt.getValue());
    }
}
