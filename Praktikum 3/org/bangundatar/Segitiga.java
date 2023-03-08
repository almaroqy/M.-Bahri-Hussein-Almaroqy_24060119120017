/*
	File:Titik.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Kelas dari Titik
*/

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
	private double alas, tinggi;
	
	public Segitiga(double alas, double tinggi, int jumlahSisi){
		this.alas = alas;
		this.tinggi = tinggi;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuasSegitiga(){
		return (alas * tinggi)/2;
	}
	
	public void printInfo(){
		System.out.println("Bangun Segitiga bersisi " + this.getJumlahSisi());
	}
}