package org.lessons.java;

public class Passerotto extends AbstractAnimal {

    @Override
    public String mangia() {
        return "Il passerotto sta mangiando i semini...";
    }

    @Override
    public String verso() {
        return "Cip cip!";
    }
}
