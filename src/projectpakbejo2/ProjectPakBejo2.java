/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpakbejo2;

/**
 *
 * @author asus
 */
public class ProjectPakBejo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Keramik2 kA = new Keramik2 (1000000,30,30,10,54000);
      System.out.println ("Luas Keramik A:" + kA.hitungLuas() + " cm ");
      System.out.println ("Harga Total Keramik A:" + kA.hitungTotal() + " rupiah ");
      
      Keramik2 kB = new Keramik2 (1000000,40,40,5,65000);
      System.out.println ("Luas Keramik A:" + kB.hitungLuas() + " cm ");
      System.out.println ("Harga Total Keramik A:" + kB.hitungTotal() + " rupiah ");
      
      Keramik2 kC = new Keramik2 (1000000,30,40,8,60000);
      System.out.println ("Luas Keramik A:" + kC.hitungLuas() + " cm ");
      System.out.println ("Harga Total Keramik A:" + kC.hitungTotal() + " rupiah ");
    }
  
        
}

