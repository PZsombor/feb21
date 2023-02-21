/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package butorgyar;

/**
 *
 * @author diak
 */
public class Butorlap {
    private double hosszusag;
    private double szelesseg;
    private boolean tipus;
    
    private final int tartolap = 5000;
    private final int hatlap = 500;
    
    public Butorlap(double hosszusag, double szelesseg, boolean tipus){
        this.hosszusag = hosszusag / 100;
        this.szelesseg = szelesseg / 100;
        this.tipus = tipus;
    }
    
    public double arSzamol(){
        return hosszusag * szelesseg *(this.tipus ? tartolap : hatlap);
    }
    
    
}
