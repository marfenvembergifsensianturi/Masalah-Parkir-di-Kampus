import java.util.Scanner;

public class Main implements AksiParkir {
    private Parkiran parkiran;

    public Main(int jumlahSlot) {
        this.parkiran = new Parkiran(jumlahSlot);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah slot parkir: ");
        int jumlahSlot = scanner.nextInt();

        Main program = new Main(jumlahSlot);

        // Skenario Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("M123");
        program.parkir(mahasiswa);
        program.keluar(mahasiswa);

        // Skenario Dosen
        Dosen dosen = new Dosen("D456");
        program.parkir(dosen);
        program.keluar(dosen);

        // Skenario Pegawai
        Pegawai pegawai = new Pegawai("P789");
        program.parkir(pegawai);
        program.keluar(pegawai);
    }

    @Override
    public void parkir(Kendaraan kendaraan) {
        int slotKosong = parkiran.temukanSlotKosong();
        if (slotKosong != -1) {
            parkiran.parkirKendaraan(slotKosong);
            System.out.println(kendaraan.getJenisKendaraan() + " " + kendaraan.getNomorInduk() +
                    " parkir di slot " + slotKosong);
        } else {
            System.out.println("Maaf, parkiran penuh untuk " + kendaraan.getJenisKendaraan() +
                    " " + kendaraan.getNomorInduk());
        }
    }

    @Override
    public void keluar(Kendaraan kendaraan) {
        int slot = parkiran.temukanSlotKosong();
        if (slot != -1) {
            parkiran.keluarKendaraan(slot);
            System.out.println(kendaraan.getJenisKendaraan() + " " + kendaraan.getNomorInduk() +
                    " keluar dari slot " + slot);
        } else {
            System.out.println("Parkiran kosong untuk " + kendaraan.getJenisKendaraan() +
                    " " + kendaraan.getNomorInduk());
        }
    }
}
