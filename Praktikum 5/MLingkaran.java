
/*
	File: MLingkaran.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Implementasi cara menghitung luas lingkaran
*/
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        System.out.println("Masukan jari-jari Lingkaran ");
        Scanner scan = new Scanner(System.in);
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        scan.close();

        System.out.println("Luas lingkaran dengan " + "Jejari " + jejari + " satuan adalah " + l.hitungLuas());
    }
}
