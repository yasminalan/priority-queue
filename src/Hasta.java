public class Hasta implements Comparable<Hasta> {
    private String isim;
    private IllnessCompliance sikayet;
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

    public Hasta(String isim, IllnessCompliance sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;

        if (sikayet == IllnessCompliance.APANDIST) {
            this.oncelik = 1;
        } else if (sikayet == IllnessCompliance.YANIK) {
            this.oncelik = 2;
        } else if (sikayet == IllnessCompliance.BAS_AGRISI) {
            this.oncelik = 3;
        }

    }
}
