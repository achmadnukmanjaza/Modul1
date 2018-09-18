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
public class KonversiNilai {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        System.out.print("Masukkan nilai web : ");
        int nilai = masukan.nextInt();
        if(nilai >= 90)
            System.out.println("Nilai A");
        if(nilai >=75)
            System.out.println("Nilai B");
        if(nilai >=50)
            System.out.println("Nilai C");
        if(nilai >=35)
            System.out.println("Nilai D");
        else
            System.out.println("Nilai E");
    }
    
}
