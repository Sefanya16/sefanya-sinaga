package Model;

public class Boba {
    private String jenis;
    private String rasa;
    private int jumlah;
    private int harga;

    public Boba(String jenis, String rasa, int jumlah, int harga) {
        this.jenis = jenis;
        this.rasa = rasa;
        this.jumlah = jumlah;
        this.harga = harga;
    }

   @Override
    public String toString() {
        harga = jumlah * harga;
        return "Jenis Boba: " + jenis + "\nRasa Boba: " + rasa + "\nJumlah Boba: " + jumlah + "\nHarga Boba: " + harga;
    }



}


