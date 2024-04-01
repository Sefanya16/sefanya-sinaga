package driver;

import java.util.*;
import Model.popice;
import Model.Boba;
import Model.minuman;


public class jumlahharga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Minuman: ");
        System.out.println("1. Boba");
        System.out.println("2. Pop Ice");
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();
        System.out.print("Jenis: ");
        String jenis = input.nextLine();
        System.out.print("Rasa: ");
        String rasa = input.nextLine();
        System.out.print("Jumlah: ");
        int jumlah = input.nextInt();
        System.out.print("Harga: ");
        int harga = input.nextInt();
        if (pilihan == 1) {
            Boba boba = new Boba(jenis, rasa, jumlah, harga);
            System.out.println(boba);
        } else if (pilihan == 2) {
            popice popice = new popice(jenis, rasa, jumlah, harga);
            System.out.println(popice);
        } else {
            System.out.println("Pilihan tidak ada");
        }
    }
    
}
