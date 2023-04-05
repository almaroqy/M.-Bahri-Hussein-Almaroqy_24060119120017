/*
	File: Asersi2.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
*/

// class Lingkaran
class Lingkaran {
	private double jariJari;

	public Lingkaran(double jariJari) {
		this.jariJari = jariJari;
	}

	public double hitungKeliling() {
		double keliling = 2 * Math.PI * jariJari;
		return keliling;
	}

	public double getjariJari() {
		return this.jariJari;
	}
}

// class Asersi2
public class Asersi2 {
	public static void main(String[] args) {
		double jariJari = 0;
		assert (jariJari > 0) : "jari jari tidak boleh nol !!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran= " + kelilingLingkaran);
	}
}
// 1. secara konsep, ada yang kurang tepat pada program Asersi2 di atas? 
// jawab:
// 1. pada bagian assert seharusnya assert(jariJari < 0) karena dia akan memeriksa apakah jariJari bernilai 0
