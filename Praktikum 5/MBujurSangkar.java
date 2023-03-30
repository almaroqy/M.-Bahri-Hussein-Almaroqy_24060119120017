
/*
	File: MBujurSangkar.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
*/
import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukan Sisi Bujur Sangkar: ");
        double sisi = scan.nextDouble();
        scan.close();
        
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " Satuan adalah " + bs.hitungLuas(sisi));
    }
}
