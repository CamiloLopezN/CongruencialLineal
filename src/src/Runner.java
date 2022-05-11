package src;

import controller.LinearCongruence;

public class Runner {
    /*
    * En caso de querer hacer uso de un caso de uso diferente basta con eliminar
    * el comentario del caso de uso en particular, y usar el que se desee pasando
    * como parametro la cantidad de datos a generar.
    * */
    public static void main(String[] args) {
        caseOne(10000);
        //caseTwo(1000);
        //caseThree(100);
    }

    public static void caseOne(int count) {
        new LinearCongruence(5, 255, 100, 1032, count).generateValues();
    }

    public static void caseTwo(int count) {
        new LinearCongruence(5, 255, 100, 1031, count).generateValues();

    }

    public static void caseThree(int count) {
        new LinearCongruence(5, 106, 1283, 6075, count).generateValues();
    }
}
