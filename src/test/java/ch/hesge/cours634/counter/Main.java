package ch.hesge.cours634.counter;

public class Main {

    public static void main(String[] args) throws CounterException {
        UpperLimitedPositiveCounter cnt = new UpperLimitedPositiveCounter(1, 10);
        cnt.inc();
        cnt.inc();
        cnt.inc();
        cnt.add(7);
        System.out.println(cnt.getValue());
    }
}
