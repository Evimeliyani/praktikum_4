package Multilevel;

class Kendaraan {
    void jalan() {
        System.out.println("Kendaraan bergerak");
    }
}

class Mobil extends Kendaraan {
    void roda() {
        System.out.println("Mobil punya 4 roda");
    }
}

class MobilSport extends Mobil {
    void turbo() {
        System.out.println("Mobil sport memiliki turbo");
    }
}

public class MainMultilevel {
    public static void main(String[] args) {
        MobilSport ms = new MobilSport();
        ms.jalan();
        ms.roda();
        ms.turbo();
    }
}

