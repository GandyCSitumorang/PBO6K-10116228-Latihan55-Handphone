/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116228.latihan55.handphone;

/**
 *Nama  : GandyChristianSitumorang
 *Kelas : PBO6K
 *NIM   : 10116228
 *Deskripsi Program : Program ini berisi program yang menampilkan manufaktur
 *                    dari sebuah handphone
 */
public class PBO6K10116228Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android adr = new Android("Samsung","Android","J5",3000000);
        adr.setKeyStore("234ibfd3840fo");
        adr.displayProduct();
        System.out.println("Android KeyStore : "+adr.getKeyStore());
        System.out.println("");
    
        BlackBerry bb = new BlackBerry("Balckberry","RIM","Curve",2000000);
        bb.setPinBB("BH167GT");
        bb.displayProduct();
        System.out.println("PIN : "+bb.getPinBB());
        System.out.println("");
    
         WindowsPhone wp = new WindowsPhone("Nokia","Win8","Lumia",3500000);
        wp.setWpKeyStore("S415BN");
        wp.displayProduct();
        System.out.println("Wp Key Store : "+wp.getWpKeyStore());
        
    }
    
}