/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119077.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author RAF
 * Nama     : Ridhwan Anwar Fauzan
 * NIM      : 10119077
 * Kelas    : IF-2
 * Deskripsi: Menyesuaikan huruf Besar dan Kecil
 */
public class PBOIF210119077Latihan27HurufBesarKecil {

    public static void besar(String kalimat){
        String strUpper = kalimat.toUpperCase();
        System.out.println("Huruf Besar : "+strUpper);
    }
    
     public static void kecil(String kalimat){
        String strLower = kalimat.toLowerCase();
        System.out.println("Huruf Kecil : "+strLower);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat;
        
    
        System.out.print("Masukkan Kalimat : ");
        kalimat = input.nextLine();
        
        System.out.println("");
        System.out.println("====Hasil Formating====");
        besar(kalimat);
        kecil(kalimat);
    }
    
}
