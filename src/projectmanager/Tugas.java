/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanager;

/**
 *
 * @author madvi
 */
public class Tugas {

    private String nama;
    private String deskripsi;

    // Konstruktor
    public Tugas(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Overriding method
    public String getDetails() {
        return "Nama Tugas: " + nama + ", Deskripsi: " + deskripsi;
    }
}
