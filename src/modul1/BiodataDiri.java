/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class BiodataDiri {
    public static void main(String[] args) {
          Scanner scan=new Scanner(System.in);
       
        String nama, Almt, Lahir, Jeniskelamin, Mottohidup;
        int Tgl,Nis;
       
      
        System.out.println(" -------- Bidodata Diri Anda -------- ");
        System.out.println();
        System.out.println();
        System.out.print("Nama              :");
        nama=scan.next();
        System.out.print("NIS               :");
        Nis=scan.nextInt();
        System.out.print("Tempat Lahir      :");
        Lahir=scan.next();
        System.out.print("Tanggal Lahir     :");
        Tgl=scan.nextInt();
        System.out.print("Jenis Kelamin     :");
        Jeniskelamin=scan.next();
        System.out.print("Alamat di Malang  :");
        Almt=scan.next();
        System.out.print("Motto Hidup       :");
        Mottohidup=scan.next();
        System.out.println();

         System.out.println(" -------- Bidodata Diri Anda -------- ");
        System.out.println();
        System.out.println();
        System.out.println("Nama Lengkap     :" + nama);
        System.out.println("NIS              :" + Nis);
        System.out.println("Tempat lahir     :" + Lahir);
        System.out.println("tanggal lahir    :" + Tgl);
        System.out.println("Jenis Kelamin    :" + Jeniskelamin);
        System.out.println("Alamat di Malang :" + Almt);
        System.out.println("Motto Hidup      :" + Mottohidup);
             
    }
}