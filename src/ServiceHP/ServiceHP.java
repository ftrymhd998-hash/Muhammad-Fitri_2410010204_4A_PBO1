package ServiceHP;
public class ServiceHP extends Pelanggan {

    private String kerusakan;
    private int biaya;

    //constructor
    public ServiceHP(String nama, String noHp, String merkHp,
                     String kerusakan, int biaya) {

        super(nama, noHp, merkHp);

        this.kerusakan = kerusakan;
        this.biaya = biaya;
    }

    // Accesor (Getter)
    public String getKerusakan() {
        return kerusakan;
    }

    public int getBiaya() {
        return biaya;
    }

    //mutator (setter)
    
    public void setKerusakan(String kerusakan) {
        this.kerusakan = kerusakan;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    // Polymorphism(Override)
    @Override
    public String toString() {

        return
        "Nama       : " + getNama() +
        "\nNo HP      : " + getNoHp() +
        "\nMerk HP    : " + getMerkHp() +
        "\nKerusakan  : " + kerusakan +
        "\nBiaya      : Rp" + biaya;
    }
}
