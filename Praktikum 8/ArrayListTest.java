/*
	File: ArrayListTest.java
	Nama: M. Bahri Hussein Almaroqy
	Deskripsi: program penggunaan objek ArrayList sebagai Collection class
*/

import java.util.ArrayList;

public class ArrayListTest{
	public static void main (String[] args){
		//inisialisasi AarrayList yang hanya dapat
		//berisi objeK String
		ArrayList<String> strings = new ArrayList <String>();
		//menambah elemen
		strings.add("praktikum");
		strings.add("collection");
		strings.add("dan generics");
		//menghapus elemen
		strings.remove("praktikum");
		//iterasi pada keseluruhan ArrayList
		for (String s : strings){
			System.out.println(s+" ");
		}
	}
}