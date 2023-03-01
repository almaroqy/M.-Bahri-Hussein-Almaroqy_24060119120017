/*
	File:Titik.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Kelas dari Titik
*/

class Titik{
	private double absis;
	private double ordinat;
	private static int counterTitik;
	
	Titik(double a, double o){
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	Titik(){
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	public void setAbsis(double a){
		absis = a;
	}
	
	public void setOrdinat(double o){
		ordinat = o;
	}
	
	public double getAbsis(){
		return absis;
	}
	
	public double getOrdinat(){
		return ordinat;
	}
	
	public int getCounterTitik(){
		return counterTitik;
	}
}