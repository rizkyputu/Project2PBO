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
public class Keramik2 {
  
    int luastanah ;
    int isi ;
    int harga;
    int panjang;
    int lebar;
    
    //constructor
    Keramik2 (int t,int p, int l,int i,int h){
        this.panjang = p;
        this.lebar = l;
        this.isi = i;
        this.harga = h;
        this.luastanah = t;
        
    }
    
    
    int hitungLuas (){
        int luas ;
        luas = this.panjang * this.lebar ;
        return luas ;
            
    }
    int hitungTotal (){
        int total ;
        total = (( this.luastanah /(this.panjang*this.lebar)/this.isi)*this.harga);
        return total ;
        
    }
}
    

