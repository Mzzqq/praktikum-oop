public class Barang {
    private String kode;
    private int jumlahBeli;
    private int harga;

    public Barang(String kode,int jumlahBeli){
        this.kode = kode;
        this.jumlahBeli = jumlahBeli;
    }

    public String getKode(){
        return kode;
    }

    public int getJumlahBeli(){
        return jumlahBeli;
    }
}
