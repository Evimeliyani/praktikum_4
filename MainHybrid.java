package Hybrid;

interface Elektronik { void daya(); }

class Alat {
    void info() {
        System.out.println("Ini adalah alat elektronik");
    }
}

class Komputer extends Alat implements Elektronik {
    public void daya() {
        System.out.println("Komputer membutuhkan listrik");
    }
}

class Laptop extends Komputer {
    void portable() {
        System.out.println("Laptop dapat dibawa kemana saja");
    }
}

public class MainHybrid {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.info();
        l.daya();
        l.portable();
    }
}

