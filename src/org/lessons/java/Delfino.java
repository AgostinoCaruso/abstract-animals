package org.lessons.java;

import org.lessons.java.interfaces.INuotante;

public class Delfino extends AbstractAnimal implements INuotante{

    @Override
    public String mangia() {
        return "Il delfino sta mangiando i crostacei...";
    }

    @Override
    public String verso() {
        return "Click click!";
    }

    @Override
    public String nuota(){
        return "Il delfino sta nuotando!";
    }
}
