public class ZakatFitri {
    private String nama;
    private double beras;
    private double uang;
    private double sedekah;

    public ZakatFitri(String nama, double beras, double uang, double sedekah){
        this.nama = nama;
        this.beras = beras;
        this.uang = uang;
        this.sedekah = sedekah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getBeras() {
        return beras;
    }

    public void setBeras(double beras) {
        this.beras = beras;
    }

    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }

    public double getSedekah() {
        return sedekah;
    }

    public void setSedekah(double sedekah) {
        this.sedekah = sedekah;
    }
}