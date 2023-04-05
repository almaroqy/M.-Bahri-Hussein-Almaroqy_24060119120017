/*
	File: AngkaSial.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
*/
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException {
        if (angka == 13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukan angka");
        }
    }
}
// 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?  
// 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?  
// jawab:
// 1. Ya, dieksekusi. Karena terdapat angka 10 yang meruapakan bukan angka sial atau bukan angka exception
// 2. Ya, dieksekusi. Karena terdapat angka 13 yang meruapkan angka sial atau merupakan angka exception