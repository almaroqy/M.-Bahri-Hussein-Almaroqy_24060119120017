/*
	File: Pegawai.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Program Superclass yag berisi nama pegawai dan gaji pokok mereka
*/
public class Pegawai {
    public String nama;
    public int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + this.nama + ", " + "Gaji Pokok : " + this.gajiPokok);
    }
}