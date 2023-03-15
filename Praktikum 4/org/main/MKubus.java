/*
	File: MKubus.java
	Nama: M. Bahri Hussein Almaroqy	
	Deskripsi: Driver class untuk kubus menjalankan fungsi luas permukaan kubus dan volume kubus
*/

package org.main;

import org.bangunruang.*;
import org.bangundatar.BujurSangkar;

public class MKubus{
	public static void main (String[] args){
		BujurSangkar persegi = new BujurSangkar(4);
		Kubus kubus = new Kubus(persegi);
		System.out.println("Luas Permukaan Kubus Dengan Panjang Sisi 4 Satuan : " + kubus.hitungLuasAlas());
		System.out.println("Volume Kubus Dengan Panjang Sisi 4 Satuan : " + kubus.hitungVolume());
	}
}