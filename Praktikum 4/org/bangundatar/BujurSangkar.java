/*
	File: BujurSangkar.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Representasi objek BujurSangkar turunan dari class poligon
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi){
		this.panjangSisi = panjangSisi;
		this.panjangSisi = 4;
	}
	public double hitungLuas(){
		return this.panjangSisi * this.panjangSisi;
	}
	public double getPanjangSisi(){
		return this.panjangSisi;
	}
}