package ch.hesge.cours634.counter;

public class UpperLimitedPositiveCounter implements ICounter {
    private int cpt;
    private int limite;
    public UpperLimitedPositiveCounter(int init, int limite) throws CounterException{
        if(init<0 || init>limite){throw new CounterException("les valeurs ne sont pas juste, la valeur initiale doit être suppérieur à 0 et inférieur à la limite");}
        this.cpt= init;
        this.limite = limite;
    }

    @Override
    public void inc() throws CounterException {
        if(this.cpt+1>this.limite){throw new CounterException("vous avez atteint la limite");}
        this.cpt+=1;
    }

    @Override
    public void add(int step) throws CounterException {
        if(step<1 || this.cpt+step>this.limite){throw new CounterException("vous ne pouvez pas incrémenter avec cette valeur");}
        this.cpt += step;
    }

    @Override
    public int getValue() {
        return cpt;
    }
}
