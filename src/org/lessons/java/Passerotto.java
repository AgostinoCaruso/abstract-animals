package org.lessons.java;

import org.lessons.java.interfaces.IVolante;

public class Passerotto extends AbstractAnimal implements IVolante {

    @Override
    public String mangia() {
        return "Il passerotto sta mangiando i semini...";
    }

    @Override
    public String verso() {
        return "Cip cip!";
    }

    @Override
    public String vola() {
        return "Il passerotto sta volando!";
    }
}
