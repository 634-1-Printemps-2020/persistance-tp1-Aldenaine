package ch.hesge.cours634.counter;

public class Counter implements ICounter {
    private int cpt;

    public Counter(){}
    @Override
    public void inc(){
        this.cpt+=1;
    }

    @Override
    public void add(int step) {
        this.cpt += step;
    }

    @Override
    public int getValue() {
        return this.cpt;
    }
}
