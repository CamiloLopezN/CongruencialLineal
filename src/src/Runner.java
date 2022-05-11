package src;

import controller.LinearCongruence;

public class Runner {
    public static void main(String[] args) {
        new LinearCongruence(54, 89, 7, 16777216, 100).generateValues();
    }
}
