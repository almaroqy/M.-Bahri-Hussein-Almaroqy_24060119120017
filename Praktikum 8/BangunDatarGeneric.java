/*
	File: BangunDatarGeneric.java
	Nama: M. Bahri Hussein Almaroqy
	Deskripsi: Kelas konstruksi generic untuk BangunDatar
*/

public class BangunDatarGeneric<T1234 extends BangunDatar>{
	private T1234 bangunDatar;
	
	public void set (T1234 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T1234 get (){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

// Pada saat T dilakukan perubahan menjadi T1,T2 atau T1234 maka
// tidak akan terjadi apa-apa karena yang dirubah hanya variabel 
// untuk bangun datar