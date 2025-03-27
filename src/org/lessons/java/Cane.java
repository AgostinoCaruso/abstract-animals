package org.lessons.java;

public class Cane extends AbstractAnimal {

    @Override
    public String mangia() {
        return "Il cane sta mangiando i croccantini...";
    }

    @Override
    public String verso() {
        return "Bau bau!";
    }
}
