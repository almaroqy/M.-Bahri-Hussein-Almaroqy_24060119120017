/*
	File:OperasiTitik.java
	Nama: M. Bahri Hussein Almaroqy
	Deskripsi: Kelas yang berisi dari Operasi Titik
*/

class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik){
		//double absis = titik.getAbsis();
		//absis = absis * -1;
		titik.setAbsis(titik.getAbsis()*-1);
	}
	
	public Titik refleksiX(Titik titik){
		refleksiSumbuX(titik);
		return titik;
	}
	
	public Titik refleksiY(Titik titik){
		refleksiSumbuY(titik);
		return titik;
	}
}