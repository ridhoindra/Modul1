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
public class Konversisuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        Double C=78.0,F=(C*9/5)+32,R=C*4/5;
        Double K=C+273.15;
        System.out.println("===== Konversi Suhu =====");
        System.out.println("Suhu 78 derajat Celcius ke Reanmur : "+R);
        System.out.println("Suhu 78 derajat Celcius ke Farenheit : "+F);
        System.out.println("Suhu 78 derajat Celcius ke Kelvin : "+K);
    }
    
}
