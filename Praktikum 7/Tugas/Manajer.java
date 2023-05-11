/*
	File: Manajer.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Program subclass dari Pegawai yang memiliki atribut tunjanga sebagai seorang manajer
*/
public class Manajer extends Pegawai {
    public int tunjangan = 700000;

    public Manajer(String nama){
        super.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+super.nama+", " + "Gaji Pokok : "+super.gajiPokok + "\n" +"Tunjangan : "+tunjangan);
    }
}
