package controller;

public class LinearCongruence {

    private int seed;
    private int multiplicator;
    private int increment;
    private int module;

    private int count;

    public LinearCongruence(int seed, int multiplicator, int increment, int module, int count) {
        this.seed = seed;
        this.multiplicator = multiplicator;
        this.increment = increment;
        this.module = module;
        this.count = count;
    }

    public void generateValues() {
        for (int i = 1; i <= count; i++) {
            int number = getNumbers(seed);
            double result = (double) number / (double) module;
            System.out.println("Numero: " + result);
            seed = number;
        }
    }

    private int getNumbers(int seed) {
        return (multiplicator * seed + increment) % module;
    }

}

