/*
 * File: LambdaList.java
 * Nama: M. Bahri Hussein Almaroqy
 * Deskripsi: Implementasi lambda pada list, digunakan sebagai parameter pada method
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaListLatihan {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060119120017", "Alma");
        mahasiswaMap.put("24060119120018", "Bambang");
        mahasiswaMap.put("24060119120019", "Cici");
        mahasiswaMap.put("24060119120020", "Didi");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + "\n" + "Nama: " + nama + "\n"));
    }
}