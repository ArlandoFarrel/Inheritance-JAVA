/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasinheritance;

/**
 *
 * @author asus
 */
public class Pegawai2 extends Pegawai {
    @Override
    public void nama(){
        System.out.println("Berikut identitas pegawai : ");
    }
    @Override
    public void pekerjaan(){
        System.out.println("Bekerja di bagian "+super.pekerjaan);
    }
}
