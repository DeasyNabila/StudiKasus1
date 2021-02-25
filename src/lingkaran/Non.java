/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaran;

/**
 *
 * @author MOKLET-1
 */
public class Non {
       double r;
       double phi;
       double luas;
    
    void Lingkaran(double r, double phi){
        this.r = r;
        this.phi = phi;        
    }
    
    void luas(){
        luas = phi*r*r;
        System.out.println("Luas Lingkaran : "+luas);
    }
    
}
