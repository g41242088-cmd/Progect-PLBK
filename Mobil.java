public class Mobil extends Kendaraan {
    private String jenis;
    
    public Mobil(String merk, int tahun, String jenis) {
        super(merk, tahun);
        this.jenis = jenis;
    }
    
    public void infoMobil() {
        super.infoKendaraan();  // ← INI YANG TERLUPA: memanggil method superclass
        System.out.println("Jenis: " + jenis);
    }
}
