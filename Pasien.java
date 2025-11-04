public class Pasien {
    protected String nama;
    protected int usia;
    protected String alamat;
    
    public Pasien(String nama, int usia, String alamat) {
        this.nama = nama;
        this.usia = usia;
        this.alamat = alamat;
    }
    
    public void infoPasien() {
        System.out.println("      Nama : " + nama);
        System.out.println("      Usia : " + usia + "tahun");
        System.out.println("     Alamat: " + alamat);
    }
}