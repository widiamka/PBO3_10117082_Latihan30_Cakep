/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117082_latihan30_cakep;
import java.util.Scanner;
/**
 *
 *  Nama : WIDIAMEGA K
* Kelas : IF3
* NIM   : 10117082
* Deskripsi Program : program ini berisi program untuk melihat apakah mahasiswa
* atau mahasiswi mengerjakan semua program sendiri atau tidak
 */


public class PBO3_10117082_Latihan30_Cakep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
   Scanner jawab = new Scanner (System.in);
        System.out.println((char)27+"[01;35mKamu "+(char)27+
                "[01;32mNgerjain Sendiri "+(char)27+ "[01;33mLatihan 17 Sampai "+
        (char)27+"[01;34mLatihan 30 Ini?");
        
        System.out.println((char)27+"[01;34mJawab "+(char)27+
                "[01;35m(Yoi/Enggak) : ");    
       String keterangan = jawab.next();
       
        System.out.println("");
        if("Yoi".equals(keterangan)||("yoi".equals(keterangan))){
            System.out.println((char)27+"[01;31mCakep Bener."+(char)27+
                    "[01;35mGood Job!!");
        }
        if("Enggak".equals(keterangan)||("enggak".equals(keterangan))){
            System.out.println((char)27+"[01;31mTetep Cakep Sih.");
            System.out.println((char)27+"[01;36mSingPenting Paham Konsepnya yee.");
             System.out.println("Keep the code works dude!");
        }
           
        
        
    
        
    }
    
}
