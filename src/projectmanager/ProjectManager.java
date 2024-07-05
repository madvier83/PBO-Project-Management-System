/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectmanager;

/**
 *
 * @author madvi
 * 
 * Tugas

    1. Constructor
    2. Inheritance
    3. Over Reading
    4. Encapsulation
 */
import java.util.Scanner;

public class ProjectManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Project project = new Project("Project Management System", "Pengembangan sistem management project untuk perusahaan.");
        
        Tugas tugas1 = new Tugas("Desain Database", "Membuat desain database untuk sistem.");
        Tugas tugas2 = new Todo("Implementasi Backend", "Mengembangkan backend menggunakan Java.", "2024-08-15");
        Tugas tugas3 = new Todo("Implementasi Frontend", "Mengembangkan frontend menggunakan ReactJS.", "2024-08-20");

        project.tambahTugas(tugas1);
        project.tambahTugas(tugas2);
        project.tambahTugas(tugas3);

        System.out.println("Informasi Project:");
        System.out.println(project.getDetails());
    }

}
