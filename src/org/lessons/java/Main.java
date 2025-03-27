package org.lessons.java;

import org.lessons.java.interfaces.INuotante;
import org.lessons.java.interfaces.IVolante;

public class Main {

    static void faiVolare(IVolante animale) {
        System.out.println(animale.vola());
    }

    static void faiNuotare(INuotante animale) {
        System.out.println(animale.nuota());
    }

    public static void main(String[] args) {
        Aquila aquila = new Aquila();
        Delfino delfino = new Delfino();
        faiVolare(aquila);
        faiNuotare(delfino);
    }
}
