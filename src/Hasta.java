public class Hasta implements Comparable<Hasta> {
    private String isim;
    private String sikayet;
    private int oncelik;

    @Override
    public String toString() {
        String bilgiler = "Hasta adi: " + this.isim +
                "\nSikayet: " + this.sikayet +
                "\nOncelik: " + this.oncelik;
        return bilgiler;
    }

    @Override
    public int compareTo(Hasta hasta) {
        if(this.oncelik < hasta.oncelik) {
            return -1;
        } else if (this.oncelik > hasta.oncelik) {
            return 1;
        }
        return 0;
    }

    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;

        if (sikayet == "Apandist") {
            this.oncelik = 1;
        } else if (sikayet == "Yanik") {
            this.oncelik = 2;
        } else if (sikayet == "Bas agrisi") {
            this.oncelik = 3;
        }

    }
}
