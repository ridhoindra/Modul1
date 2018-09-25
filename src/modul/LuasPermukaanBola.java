/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;
import java.util.Scanner;
/**
 *
 * @author Indrachelsea
 */
public class LuasPermukaanBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("masukkan jari jari bola : ");
        Double r = a.nextDouble();
        Double phi=3.14;
        Double luas = 4*phi*r*r;
        
        System.out.println("Luas Permukaan Bola : "+luas);
    }
    
}
