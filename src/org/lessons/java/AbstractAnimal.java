package org.lessons.java;

//abstract class possono avere costruttore,campi e metodi
//possono avere anche metodi astratti, ovvero solo dichiarati con la firma
public abstract class AbstractAnimal {

    public AbstractAnimal() {
    }

    public String dormi() {
        return "zzz...";
    }

    // queste vanno implementate dentro le clasi che la ereditano
    public abstract String mangia();

    public abstract String verso();

    public String toString() {
        return mangia() + " dopo che ha mangiato dorme " + dormi() + "\n" + verso();
    }
}
