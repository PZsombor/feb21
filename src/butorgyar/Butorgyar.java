/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package butorgyar;

/**
 *
 * @author diak
 */
public class Butorgyar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Butor eminem = new Butor();
        
        Butorlap lap1 = new Butorlap(35, 180, true);
        Butorlap lap2 = new Butorlap(50, 190, false);
        Butorlap lap3 = new Butorlap(78, 53, false);
        
        eminem.lapHozzaad(lap1);
        eminem.lapHozzaad(lap2);
        eminem.lapHozzaad(lap3);
        eminem.lapHozzaad(lap1);
        
        System.out.println("Lóca: " + eminem);
        
    }
    
}
