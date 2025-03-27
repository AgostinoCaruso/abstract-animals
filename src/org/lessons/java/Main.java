package org.lessons.java;

import org.lessons.java.interfaces.INuotante;
import org.lessons.java.interfaces.IVolante;

public class Main {

    void faiVolare(IVolante animale) {
        System.out.println(animale.vola());
    }

    void faiNuotare(INuotante animale) {
        System.out.println(animale.nuota());
    }

    public static void main(String[] args) {
        Main main = new Main();
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();
        main.faiVolare(aquila);
        main.faiNuotare(delfino);
    }
}
