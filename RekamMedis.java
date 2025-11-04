public class RekamMedis extends Pasien {
    private String diagnosa;
    private String perawatan;
    
    public RekamMedis(String nama, int usia, String alamat, String diagnosa, String perawatan) {
        super(nama, usia, alamat);
        this.diagnosa = diagnosa;
        this.perawatan = perawatan;
    }
    
    public void infoRekamMedis() {
        super.infoPasien();
        System.out.println("     Diagnosa : " + diagnosa);
        System.out.println("     Perawatan : " + perawatan);
    }
}