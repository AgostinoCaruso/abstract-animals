package org.lessons.java;

public class App {
    public static void main(String[] args) {
        AbstractAnimal[] animali = new AbstractAnimal[4];
        animali[0] = new Cane();
        animali[1] = new Passerotto();
        animali[2] = new Aquila();
        animali[3] = new Delfino();

        for (int i = 0; i < animali.length; i++) {
            System.out.println(animali[i].toString());
        }
    }
}
