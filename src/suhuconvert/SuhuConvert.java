/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhuconvert;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SuhuConvert {

    static float suhu;
   
            
    public static void main(String[] args) {
         
          int pilih;
        
          Scanner input = new Scanner(System.in);
          System.out.print("Masukan Nilai suhu (celcius) : ");
          suhu = input.nextFloat();
          
          SuhuBenda sbenda = new SuhuBenda(suhu);
         
          
        OUTER:
        while (true) {
            System.out.println(" Opsi");
            System.out.println("------");
            System.out.println("1. Lihat Konversi ");
            System.out.println("2. Edit Data Konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            pilih = input.nextInt();
            switch (pilih) {
                case 1:
                    sbenda.convert();
                    break;
                case 2:
                    System.out.print("Masukan Nilai suhu (celcius) : ");
                    suhu = input.nextFloat();
                    sbenda.edit(suhu);
                    break;
                case 3:
                    break OUTER;
                default:
                    System.out.println("Yang bener cok");
                    break;
            }
        }
    }
    
}
