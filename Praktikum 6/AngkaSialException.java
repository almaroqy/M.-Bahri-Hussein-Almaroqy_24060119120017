/*
	File: AngkaSialException.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Eksepsi buatan sendiri, menolak angka 13!
*/

public class AngkaSialException extends Exception {
    public AngkaSialException (){
        super ("jangan memasukan angka 13 karena angka sial !!!");
    }
}
