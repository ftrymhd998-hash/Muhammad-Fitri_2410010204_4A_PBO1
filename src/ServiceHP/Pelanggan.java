package ServiceHP;
public class Pelanggan {

    //atribut
    private String nama;
    private String noHp;
    private String merkHp;

    //constructor
    public Pelanggan(String nama, String noHp, String merkHp) {
        this.nama = nama;
        this.noHp = noHp;
        this.merkHp = merkHp;
    }

    // Accesor (Getter)
    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getMerkHp() {
        return merkHp;
    }

    // Mutator(Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void setMerkHp(String merkHp) {
        this.merkHp = merkHp;
    }
}
