
package tugasinheritance;

public class Overload {
    void gaji(String bagian){
        int gaji = 1200000;
        System.out.println("Gaji utama yang didapat = Rp."+gaji);   
    }
    void gaji(String bagian, String kinerja){
        int gaji = 2400000;
        System.out.println("Gaji yang didapat jika bekerja secara baik menjadi = Rp."+gaji);
    }
}
