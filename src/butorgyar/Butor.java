/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package butorgyar;

/**
 *
 * @author diak
 */
public class Butor {
    Butorlap[] lapok;
    private int lapokSzama;
    
    public Butor(){
        this.lapokSzama = 0;
        lapok = new Butorlap[100];
    }
    
    public void lapHozzaad(Butorlap lap){
        if(lapokSzama<100){
            this.lapok[lapokSzama++]=lap;
        }
    }
    
    public double arSzamol(){
        double ar = 0;
        for (int i = 0; i < lapokSzama; i++) {
            ar+=lapok[i].arSzamol();
        }
        return ar;
    }

    @Override
    public String toString() {
        return "Bútorlapok: " + lapokSzama + ", ár: " + this.arSzamol();
    }
    
    
}
