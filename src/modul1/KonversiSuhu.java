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
public class KonversiSuhu {
    public static void main(String[]args){
        Scanner masukan = new Scanner(System.in);
        double celcius = 78,reamur,kelvin,farenhait;
        int pilihan;
        boolean ulangi = true;
      
        
        do{
        System.out.println("----- Konverensi Suhu -----");
        System.out.println("");
        System.out.println("1. Kelvin\n2. Reamur\n3. Farenhait");
        System.out.println("");
        System.out.print("Masukan pilihan anda : ");
        pilihan = masukan.nextInt();
        switch (pilihan) {
            case 1 : kelvin = celcius + 273;
                System.out.println("");
                System.out.println("Celcius : 78 ");
                System.out.println("Celcius menjadi Kelvin adalah : " + kelvin);
                System.out.println("");
                System.out.print("Apakah anda ingin mengulang program ? (true/false)");
                ulangi = masukan.nextBoolean();
            break;
            case 2 : reamur = 4*celcius/5;
                System.out.println("");
                System.out.println("Celcius : 78 ");
                System.out.println("Celcius menjadi Reamur adalah : " + reamur);
                System.out.println("");
                System.out.print("Apakah anda ingin mengulang program ? (true/false)");
                ulangi = masukan.nextBoolean();
            break;
            case 3 : farenhait = 9*celcius/5+32;
                System.out.println("");
                System.out.println("Celcius : 78 ");
                System.out.println("Celcius menjadi Farenhait adalah : " + farenhait);
                System.out.println("");
                System.out.print("Apakah anda ingin mengulang program ? (true/false)");
                ulangi = masukan.nextBoolean();
        }
    }
        while (ulangi == true);
   System.out.println();
   System.out.println("----- Program Selesai -----");
  }      
}
    
