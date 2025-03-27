package org.lessons.java;

import org.lessons.java.interfaces.IVolante;

public class Aquila extends AbstractAnimal implements IVolante{

    @Override
    public String mangia() {
        return "L'aquila sta mangiando una volpe...";
    }

    @Override
    public String verso() {
        return "Skree!";
    }

    @Override
    public String vola(){
        return "L'aquila sta volando!";
    }
}
