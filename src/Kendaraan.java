// Entitas utama
public class Kendaraan {
    private String nomorInduk;
    private String jenisKendaraan;

    public Kendaraan(String nomorInduk, String jenisKendaraan) {
        this.nomorInduk = nomorInduk;
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getNomorInduk() {
        return nomorInduk;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }
}
