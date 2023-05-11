/*
	File: Programmer.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Program turunan dari pegwawi yang memiliki atribut bonus sebagai seorang programmer
*/
public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama){
        super.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : "+super.nama+", " + "Gaji Pokok : "+super.gajiPokok + "\n" +"Bonus : "+bonus);
    }
}
