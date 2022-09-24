
package tugasinheritance;

public class TugasInheritance {
    
    public static void main(String[] args) {
        Overload a = new Overload();
        Admin b = new Admin();
        Pegawai2 c = new Pegawai2();
        
        c.nama();
        b.setNama("Diah");
        System.out.println("Nama = "+b.getNama());
        b.setJenisKelamin("Perempuan");
        System.out.println("Jenis Kelamin = "+b.getJenisKelamin());
        b.setId("333333");
        System.out.println("Nomor Pegawai = "+b.getId());
        c.pekerjaan();
        a.gaji("Admin");
        a.gaji("Admin", "Baik");
    }
    
}
