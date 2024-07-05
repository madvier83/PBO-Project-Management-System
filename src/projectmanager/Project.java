/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanager;

/**
 *
 * @author madvi
 */
import java.util.ArrayList;

public class Project {

    private String nama;
    private String deskripsi;
    private ArrayList<Tugas> daftarTugas;

    // Konstruktor
    public Project(String nama, String deskripsi) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.daftarTugas = new ArrayList<>();
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public ArrayList<Tugas> getDaftarTugas() {
        return daftarTugas;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Menambahkan tugas ke Project
    public void tambahTugas(Tugas tugas) {
        daftarTugas.add(tugas);
    }

    // Overriding method
    public String getDetails() {
        String details = "Nama Project: " + nama + "\nDeskripsi: " + deskripsi + "\n\nDaftar Tugas:\n";
        for (Tugas tugas : daftarTugas) {
            details += tugas.getDetails() + "\n";
        }
        return details;
    }
}
