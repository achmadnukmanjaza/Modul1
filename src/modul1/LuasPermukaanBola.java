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
public class LuasPermukaanBola {
    public static void main(String[]args){
    double luas,phi,jari2;
    Scanner scan = new Scanner(System.in);
    phi = 3.14;
        System.out.println("--- Menghitung Luas Permukaan Bola ---");
        System.out.println("");
        System.out.print("Masukan jari jari : ");
        jari2 = scan.nextInt();
        
        luas = 4*phi*jari2*jari2;
        
        System.out.println("Luas permukaan bola adalah : " + luas);
    }
}
