package Hierarchical;

class Binatang {
    void hidup() {
        System.out.println("Semua binatang hidup");
    }
}

class Ayam extends Binatang {
    void makanJagung() {
        System.out.println("Ayam makan jagung");
    }
}

class Ikan extends Binatang {
    void berenang() {
        System.out.println("Ikan berenang di air");
    }
}

public class MainHierarchical {
    public static void main(String[] args) {
        Ayam a = new Ayam();
        Ikan i = new Ikan();
        a.hidup();
        a.makanJagung();
        i.hidup();
        i.berenang();
    }
}

