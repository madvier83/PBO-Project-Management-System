/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectmanager;

/**
 *
 * @author madvi
 */
public class Todo extends Tugas {

    private String batasWaktu;

    // Konstruktor
    public Todo(String nama, String deskripsi, String batasWaktu) {
        super(nama, deskripsi);
        this.batasWaktu = batasWaktu;
    }

    // Getter
    public String getBatasWaktu() {
        return batasWaktu;
    }

    // Setter
    public void setBatasWaktu(String batasWaktu) {
        this.batasWaktu = batasWaktu;
    }

    // Overriding method
    @Override
    public String getDetails() {
        return super.getDetails() + ", Batas Waktu: " + batasWaktu;
    }
}
