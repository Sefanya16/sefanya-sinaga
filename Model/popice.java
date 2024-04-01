package Model;
public class popice {
    private String jenis;
    private String rasa;
    private int jumlah;
    private int harga;

    public popice(String jenis, String rasa, int jumlah, int harga) {
        this.jenis = jenis;
        this.rasa = rasa;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    @Override
    public String toString() {

        //harga = jumlah * harga;

        harga = jumlah * harga;

        return "Jenis Pop Ice: " + jenis + "\nRasa Pop Ice: " + rasa + "\nJumlah Pop Ice: " + jumlah + "\nHarga Pop Ice: " + harga;
        

    }
    
}
