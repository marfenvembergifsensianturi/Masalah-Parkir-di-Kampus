// Kelas untuk Parkiran
public class Parkiran {
    private boolean[] slotParkir;

    public Parkiran(int jumlahSlot) {
        this.slotParkir = new boolean[jumlahSlot];
    }

    public int temukanSlotKosong() {
        for (int i = 0; i < slotParkir.length; i++) {
            if (!slotParkir[i]) {
                return i;
            }
        }
        return -1; // Tidak ada slot kosong
    }

    public void parkirKendaraan(int slot) {
        slotParkir[slot] = true;
    }

    public void keluarKendaraan(int slot) {
        slotParkir[slot] = false;
    }
}
