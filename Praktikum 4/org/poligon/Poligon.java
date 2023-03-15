/*
	File: Poligon.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Representasi dasar objek poligon (Segi Banyak)
*/

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	
	
	public void Poligon(){
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}

}