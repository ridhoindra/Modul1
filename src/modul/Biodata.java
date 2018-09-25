/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;

import javax.swing.JOptionPane;

/**
 *
 * @author Indrachelsea
 */
public class Biodata {

    /**
     * @param args the command line arguments
     */
    public static String nama, tempatlahir, tanggallahir, kelamin, alamat, motto;
    public static int NIS;

    public static void main(String[] args) {
        isi();
        tampil();
    }

    static void isi() {

        nama = (JOptionPane.showInputDialog("Nama:"));
        NIS = Integer.parseInt(JOptionPane.showInputDialog("NIS:"));
        tempatlahir = (JOptionPane.showInputDialog("Tempat Lahir:"));
        tanggallahir = (JOptionPane.showInputDialog("Tanggal Lahir:"));
        kelamin = (JOptionPane.showInputDialog("Jenis Kelamin:"));
        alamat = (JOptionPane.showInputDialog("Alamat di Malang:"));
        motto = (JOptionPane.showInputDialog("Motto Hidup:"));

    }

    static void tampil() {
        System.out.println("");
        System.out.println("");
        System.out.println("=============================");
        System.out.println("          Biodata");
        System.out.println("=============================");
        System.out.println("Nama                       : " + nama);
        System.out.println("NIS                        : " + NIS);
        System.out.println("Tempat Lahir               : " + tempatlahir);
        System.out.println("Tanggal Lahir              : " + tanggallahir);
        System.out.println("Jenis Kelamin              : " + kelamin);
        System.out.println("Alamat di Malang           : " + alamat);
        System.out.println("Motto Hidup                : " + motto);
    }

}
