package Multiple;

class Bebek implements Terbang, Berenang {
    public void terbang() {
        System.out.println("Bebek bisa terbang pendek");
    }

    public void berenang() {
        System.out.println("Bebek berenang di danau");
    }
}

public class MainMultiple {
    public static void main(String[] args) {
        Bebek b = new Bebek();
        b.terbang();
        b.berenang();
    }
}

